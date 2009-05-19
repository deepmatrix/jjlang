package org.javajavalang.JavaImprinting;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import com.sun.org.apache.bcel.internal.util.ClassPath;

class InMemorySourceCompiler {
/*	   protected String name;
	   protected String source;
	   protected Class compiledClass;
	  
	   public InMemorySourceCompiler(String name, String source) throws Exception {
	      this.name = name;
	      this.source = source;
	      loadClass();
	   }
	 
	   protected void loadClass() throws Exception {
	      ClassPath cp = new ClassPath(System.getProperty("java.class.path"));
	      OutputStream os = System.out;
	      BatchEnvironment be = new BatchEnvironment(os, cp);
	      be.flags = 0x41004;
	      be.majorVersion = 45;
	      be.minorVersion = 3;
	      be.covFile = null;
	      be.setCharacterEncoding(null);
	 
	      be.parseFile(new InMemorySourceClassFile(name+".java", source));
	 
	      ByteArrayOutputStream baos = new ByteArrayOutputStream(4096);
	 
	      be.flushErrors();
	      Vector v = new Vector();
	 
	      for (Enumeration enum = be.getClasses(); enum.hasMoreElements();) {
	         v.addElement(enum.nextElement());
	      }
	 
	      for (int i=0; i<v.size(); i++) {
	         ClassDeclaration cd = (ClassDeclaration) v.elementAt(i);
	         Object object = cd.getClassDefinition(be);
	 
	         if (object instanceof SourceClass) {
	            SourceClass sourceclass = (SourceClass) object;
	            cd.setDefinition(sourceclass, 5);
	            SourceClass sourceclass1 = (SourceClass) object;
	            baos.reset();
	            sourceclass.compile(baos);
	         }
	         else if (object instanceof BinaryClass) {
	            BinaryClass binaryclass = (BinaryClass) object;
	            binaryclass.write(be, baos);
	         }
	         byte[] b = baos.toByteArray();
	 
	         InMemorySourceCompilerClassLoader myClassLoader = new InMemorySourceCompilerClassLoader();
	         compiledClass = myClassLoader.getClassFromBytes(name, b);
	      }
	   }
	 
	   public void executeMain() throws Exception {
	      Method m = compiledClass.getMethod("main", new Class[]{ String[].class });
	      m.invoke(null, new Object[]{null});
	   }
	 
	   static class InMemorySourceCompilerClassLoader extends ClassLoader
	   {
	      public Class getClassFromBytes(String name, byte[] b) {
	         return defineClass(name, b, 0, b.length);
	      }
	   }
	   
	   public static void main(String args[]) throws Exception
	   {
	      // Save all data written to System.out to a byte array and display in frame
	      PrintStream ps = System.out;
	      ByteArrayOutputStream baos = new ByteArrayOutputStream();
	      System.setOut(new PrintStream(baos));
	 
	      InMemorySourceCompiler imsCompiler = new InMemorySourceCompiler("Test",
	          "public class Test {" +
	          "   public static void main(String args[]) {" +
	          "      System.out.println(\"Output of program:\");" +
	          "      for (int i=0; i<10; i++) {" +
	          "         System.out.println(i);" +
	          "      }" +
	          "      System.out.println(\"End of output.\");" + 
	          "   }" +
	          "}");
	      imsCompiler.executeMain();
	 
	      byte[] b = baos.toByteArray();
	 
	      System.setOut(ps);
	 
	      String s = new String(b);

	   }*/
	}
