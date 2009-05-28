package org.javajavalang.JavaImprinting;

import java.util.ArrayList;
import java.util.List;

public class JSource {
	
	public JSource() {}
	public JSource(String packageName)
	{
		this.packageName = packageName;
	}
	
	private String packageName;
	
	/**
	 * @param packageName the packageName to set
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	
	/**
	 * @return the packageName
	 */
	public String getPackageName() {
		return packageName;
	}
	
	private List<JImportDeclaration> importDeclarations = new ArrayList<JImportDeclaration>();
	/**
	 * @param importDeclaration the importDeclaration to set
	 */
	public void setImportDeclarations(List<JImportDeclaration> importDeclarations) {
		this.importDeclarations = importDeclarations;
	}	
	/**
	 * @return the importDeclaration
	 */
	public List<JImportDeclaration> getImportDeclarations() {
		return importDeclarations;
	}
	
	public void addImportDeclaration(JImportDeclaration decl)
	{
		this.importDeclarations.add(decl);
	}
	
	private List<JTypeDeclaration> typeDeclarations = new ArrayList<JTypeDeclaration>();

	/**
	 * @param typeDeclaration the typeDeclaration to set
	 */
	public void setTypeDeclarations(List<JTypeDeclaration> typeDeclarations) {
		this.typeDeclarations = typeDeclarations;
	}
	
	/**
	 * @return the typeDeclaration
	 */
	public List<JTypeDeclaration> getTypeDeclarations() {
		return typeDeclarations;
	}
	
	public void addTypeDeclaration(JTypeDeclaration typeDeclaration) {
		this.typeDeclarations.add(typeDeclaration);
	}
	
	public List<JClassDeclaration> getClassDeclarations(){
		List<JClassDeclaration> result = new ArrayList<JClassDeclaration>();
		for (JTypeDeclaration decl : this.typeDeclarations){
			if (decl instanceof JClassDeclaration) result.add((JClassDeclaration)decl);			
		}
		return result;
	}

	public List<JInterfaceDeclaration> getInterfaceDeclarations(){
		List<JInterfaceDeclaration> result = new ArrayList<JInterfaceDeclaration>();
		for (JTypeDeclaration decl : this.typeDeclarations){
			if (decl instanceof JInterfaceDeclaration) result.add((JInterfaceDeclaration)decl);			
		}
		return result;
	}
	
	public JClassDeclaration getClassDeclaration(String id) {
		List<JClassDeclaration> classes = this.getClassDeclarations();
		for (JClassDeclaration decl : classes){
			if (decl.ident == id)
				return decl;
		}
		return null;
	}
}
