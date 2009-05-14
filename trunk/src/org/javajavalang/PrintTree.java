package org.javajavalang;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.TreeVisitor;
import org.antlr.runtime.tree.TreeVisitorAction;

public class PrintTree implements TreeVisitorAction {
	
	private TreeVisitor visitor;
	
	private int offset = 0;

	public PrintTree() {
		this.visitor = new TreeVisitor();
	}

	public void print(CommonTree tree) {
		visitor.visit(tree, this);
	}

	public static void printTree(CommonTree tree) {
		PrintTree p = new PrintTree();
		p.print(tree);
	}

	@Override
	public Object post(Object arg0) {
		offset--;
		return null;
	}

	private String getOffsetString(char c)
	{
		StringBuilder sb = new StringBuilder();
		for (int i=0; i < offset;i++)
			sb.append(c);
		return sb.toString();
	}
	
	@Override
	public Object pre(Object arg0) {        	
		//System.out.println("+" + getOffsetString('-') + arg0);
		CommonTree tree =  (CommonTree) arg0;
		System.out.println("-> " + tree.token.toString());
		offset++;
		return null;
	}

}
