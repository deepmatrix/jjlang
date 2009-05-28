package org.javajavalang.JavaImprinting;

import java.util.ArrayList;
import java.util.List;

public abstract class JTypeDeclaration extends JDeclaration implements JScopeClause {
			
	public List<JDeclaration> scopeDeclarations = new ArrayList<JDeclaration>();

}
