package org.javajavalang.JavaImprinting;

import java.util.ArrayList;
import java.util.List;

public class JCodeBlock {
	public List<JVariableDeclaration> localVariables = new ArrayList<JVariableDeclaration>();
	
	public void addLocalVariables(Object o) {
		// ignore
	}
	public void addLocalVariables(List<JVariableDeclaration> lst) {
		this.localVariables.addAll(lst);		
	}
}
