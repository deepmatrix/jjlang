package org.javajavalang.JavaImprinting;

import java.util.ArrayList;
import java.util.List;

public class JMethodDeclaration extends JDeclaration {
	public JMethodDeclaration(String ident){
		this.ident = ident;
	}
	public List<JVariableDeclaration> parameters = new ArrayList<JVariableDeclaration>();
	public JCodeBlock block = null;	
	
	public boolean hasFormalParameter(String ident){		
		for (JVariableDeclaration decl : parameters){
			if (decl.ident.equals(ident))
				return true;
		}
		return false;
	}
	
	public boolean hasLocalVariable(String ident){
		if (block==null) return false;
		for (JVariableDeclaration decl : block.localVariables){
			if (decl.ident.equals(ident))
				return true;
		}
		return false;		
	}
}
