package org.javajavalang.JavaImprinting;

import java.util.ArrayList;
import java.util.List;

public class JClassDeclaration extends JTypeDeclaration {
	
	@Override
	public List<JTypeDeclaration> getDefinedTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<JVariableDeclaration> getDefinedVariables() {
		List<JVariableDeclaration> result = new ArrayList<JVariableDeclaration>();
		for (JDeclaration decl: this.scopeDeclarations){
			if (decl instanceof JVariableDeclaration) result.add((JVariableDeclaration)decl);				
		}
		return result;
	}
	
	public List<JMethodDeclaration> getDefinedMethods() {
		List<JMethodDeclaration> result = new ArrayList<JMethodDeclaration>();
		for (JDeclaration decl: this.scopeDeclarations){
			if (decl instanceof JMethodDeclaration) result.add((JMethodDeclaration)decl);				
		}
		return result;
	}
	
	public JMethodDeclaration findDefinedMethod(String id) {
		List<JMethodDeclaration> methods = this.getDefinedMethods();
		for (JMethodDeclaration decl : methods){
			if (decl.ident.equals(id)) {				
				return decl;
			}
		}
		return null;
	}
	
	public boolean hasMethod(String id){		
		List<JMethodDeclaration> methods = this.getDefinedMethods();
		for (JMethodDeclaration decl : methods){
			if (decl.ident.equals(id)) {				
				return true;
			}
		}
		return false;
	}

	public boolean hasVariable(String id){		
		List<JVariableDeclaration> vars = this.getDefinedVariables();
		for (JVariableDeclaration decl : vars){
			if (decl.ident.equals(id))
				return true;
		}
		return false;
	}
	
}
