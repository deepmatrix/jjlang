package org.javajavalang;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.runtime.*;
import org.antlr.runtime.debug.BlankDebugEventListener;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.javajavalang.JavaImprinting.JSource;
import org.javajavalang.target.PHP.PhpTarget;

public class JJLangTool {

	public static boolean debugTree = true;

	public static long lexerTime = 0;
	public static boolean profile = false;

	public static JavaLexer lexer;

	public static JavaParser parser;

	public static Target target;

	private static String makePath(String candidate)
	{
		return candidate.replace('/',File.separatorChar);
	}
	
	public static void main(String[] args) {
		try {
			long start = System.currentTimeMillis();

			// target
			target = new PhpTarget();

			// templates			
			FileReader groupFileR = new FileReader(makePath("src/org/javajavalang/target/"+target.getName()+"/")+target.getName() + ".stg");
			templates = new StringTemplateGroup(groupFileR);
			groupFileR.close();

			// args
			if (args.length > 0) {
				// for each directory/file specified on the command line
				for (int i = 0; i < args.length; i++) {
					doFile(new File(args[i])); // parse it
				}
			} else {
				System.err.println("Usage: java Main <directory or file name>");
			}
			long stop = System.currentTimeMillis();

			System.out.println("finished parsing OK");
			if (profile) {
				System.out.println("num decisions " + profiler.numDecisions);
			}
			System.out.println("elapsed time " + (stop - start) + " ms");
		} catch (Exception e) {
			System.err.println("exception: " + e);
			e.printStackTrace(System.err); // so we can get stack trace
		}
	}

	// This method decides what action to take based on the type of
	// file we are looking at
	public static void doFile(File f) throws Exception {
		// If this is a directory, walk each file/dir in that directory
		if (f.isDirectory()) {
			String files[] = f.list();
			for (int i = 0; i < files.length; i++)
				doFile(new File(f, files[i]));
		}

		// otherwise, if this is a java file, parse it!
		else if (((f.getName().length() > 5) && f.getName().substring(
				f.getName().length() - 5).equals(".java"))
				|| f.getName().equals("input")) {
			System.err.println("parsing " + f.getAbsolutePath());
			parseFile(f.getAbsolutePath());
		}
	}

	static class CountDecisions extends BlankDebugEventListener {
		public int numDecisions = 0;

		public void enterDecision(int decisionNumber) {
			numDecisions++;
		}
	}

	static CountDecisions profiler = new CountDecisions();

	public static void parseFile(String filename) throws Exception {
		try {
			// PARSE INPUT AND BUILD AST
			// Create a scanner that reads from the input stream passed to us
			if (lexer == null) {
				lexer = new JavaLexer();
			}
			lexer.setCharStream(new ANTLRFileStream(filename));
			CommonTokenStream tokens = new CommonTokenStream();
			// tokens.discardOffChannelTokens(true);
			tokens.setTokenSource(lexer);
			long start = System.currentTimeMillis();
			tokens.LT(1); // force load
			long stop = System.currentTimeMillis();
			lexerTime += stop - start;

			/*
			 * long t1 = System.currentTimeMillis(); tokens.LT(1); long t2 =
			 * System.currentTimeMillis();
			 * System.out.println("lexing time: "+(t2-t1)+"ms");
			 */
			// System.out.println(tokens);
			// Create a parser that reads from the scanner
			JavaParser parser = null;
			parser = new JavaParser(tokens);
			// call compilationUnit() to grasp return and tree for
			// TreeNodesStream
			JavaParser.javaSource_return r = parser.javaSource();
			CommonTree tree = (CommonTree) r.getTree();
			if (debugTree)
				PrintTree.printTree(tree);

			// finally walk grammar to emit code
			walkGrammar(filename, tokens, tree);
		} catch (Exception e) {
			System.err.println("parser exception: " + e);
			e.printStackTrace(); // so we can get stack trace
		}
	}

	public static StringTemplateGroup templates;

	public static void walkGrammar(String filename, CommonTokenStream tokens,
			CommonTree tree) {
		// IMPRINT TREE
		CommonTreeNodeStream imprinterNodes = new CommonTreeNodeStream(tree);
		JSource sourceImprint = null;
		try {
			imprinterNodes.setTokenStream(tokens);
			Imprinter imprinter = new Imprinter(imprinterNodes);
			Imprinter.targetSource_return r1 = imprinter.targetSource();
			assert (r1.value!=null);
			sourceImprint = r1.value;
		} catch (Exception e) {
			System.err.println("Error trying to set up imprinter and imprint the grammar: "+e);
			e.printStackTrace();
			return;
		}
		// WALK TREE
		CommonTreeNodeStream generatorNodes = new CommonTreeNodeStream(tree);		
		Generator generator = null;
		try {			
			generatorNodes.setTokenStream(tokens);
			generator = new Generator(generatorNodes);
			generator.setObserver(new GenerationObserver(generator, target, sourceImprint));
			generator.setTemplateLib(templates); // link templates
		} catch (Exception e) {
			System.err.println("Error trying to set up generator and generation observer: "+e);
			e.printStackTrace();
			return;
		}

		// invoke central rule, passing in information from parser
		Generator.targetSource_return r2;
		try {
			r2 = generator.targetSource();
		} catch (RecognitionException e1) {
			System.err.println("Error parsing target source: "+e1);
			e1.printStackTrace();
			return;
		}

		// EMIT PHP CODE
		// get template from return values struct
		String outputFilename = filename.replaceFirst("\\.java\\z", "").concat(target.getTargetFileExtension());

		try {
			FileWriter outFile = null;
			outFile = new FileWriter(outputFilename);
			PrintWriter out = new PrintWriter(outFile);
			StringTemplate template = (StringTemplate) r2.getTemplate();
			if (template == null) {
				System.err.println("No template was generated.");
			} else {
				out.println(template.toString()); // render full template
			}
			outFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
