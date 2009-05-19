package org.javajavalang.JavaImprinting;

import java.util.List;

public interface JScopeClause {

	public List<JVariableDeclaration> getDefinedVariables();
	
	public List<JTypeDeclaration> getDefinedTypes();
	
}
