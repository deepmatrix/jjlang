package org.javajavalang.JavaImprinting;

import java.util.List;

public class JSource {
	
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
	
	private List<JTypeDeclaration> importDeclaration;
	/**
	 * @param importDeclaration the importDeclaration to set
	 */
	public void setImportDeclaration(List<JTypeDeclaration> importDeclaration) {
		this.importDeclaration = importDeclaration;
	}	
	/**
	 * @return the importDeclaration
	 */
	public List<JTypeDeclaration> getImportDeclaration() {
		return importDeclaration;
	}
	
	private List<JTypeDeclaration> typeDeclaration;

	/**
	 * @param typeDeclaration the typeDeclaration to set
	 */
	public void setTypeDeclaration(List<JTypeDeclaration> typeDeclaration) {
		this.typeDeclaration = typeDeclaration;
	}
	
	/**
	 * @return the typeDeclaration
	 */
	public List<JTypeDeclaration> getTypeDeclaration() {
		return typeDeclaration;
	}
		
	private List<JClass> classDeclarations;

	/**
	 * @param classDeclarations the classDeclarations to set
	 */
	public void setClassDeclarations(List<JClass> classDeclarations) {
		this.classDeclarations = classDeclarations;
	}

	/**
	 * @return the classDeclarations
	 */
	public List<JClass> getClassDeclarations() {
		return classDeclarations;
	}
	
	private List<JInterface> interfaceDeclarations;
	
	/**
	 * @param interfaceDeclarations the interfaceDeclarations to set
	 */
	public void setInterfaceDeclarations(List<JInterface> interfaceDeclarations) {
		this.interfaceDeclarations = interfaceDeclarations;
	}

	/**
	 * @return the interfaceDeclarations
	 */
	public List<JInterface> getInterfaceDeclarations() {
		return interfaceDeclarations;
	}

}
