package org.javajavalang.JavaImprinting;

public class JVariableDeclaration extends JDeclaration {
	public boolean isFormalParameter = false;
	
	public JVariableDeclaration(String ident){
		this.ident = ident;
	}
	public JVariableDeclaration(String ident, boolean isFormalParameter){
		this.ident = ident;
		this.isFormalParameter = isFormalParameter;
	}	
}
