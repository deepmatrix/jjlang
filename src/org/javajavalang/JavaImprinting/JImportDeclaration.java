package org.javajavalang.JavaImprinting;

public class JImportDeclaration {
	private boolean isStatic = false; 
	private boolean endsWithDotStar = false;
	private String qualifiedIdentifier;
	
	/**
	 * @param isStatic the isStatic to set
	 */
	public JImportDeclaration(String qualifiedIdentifier) {		
		this.qualifiedIdentifier = qualifiedIdentifier;	
	}
	public JImportDeclaration(boolean isStatic, String qualifiedIdentifier) {
		this.isStatic = isStatic;
		this.qualifiedIdentifier = qualifiedIdentifier;	
	}
	public JImportDeclaration(boolean isStatic, String qualifiedIdentifier, boolean endsWithDotStar) {
		this.isStatic = isStatic;
		this.qualifiedIdentifier = qualifiedIdentifier;
		this.endsWithDotStar = endsWithDotStar;
	}
	
	/**
	 * @param isStatic the isStatic to set
	 */
	public void setStatic(boolean isStatic) {
		this.isStatic = isStatic;
	}
	/**
	 * @return the isStatic
	 */
	public boolean isStatic() {
		return isStatic;
	}
	/**
	 * @param endsWithDotStar the endsWithDotStar to set
	 */
	public void setEndsWithDotStar(boolean endsWithDotStar) {
		this.endsWithDotStar = endsWithDotStar;
	}
	/**
	 * @return the endsWithDotStar
	 */
	public boolean endsWithDotStar() {
		return endsWithDotStar;
	}
	/**
	 * @param qualifiedIdentifier the qualifiedIdentifier to set
	 */
	public void setQualifiedIdentifier(String qualifiedIdentifier) {
		this.qualifiedIdentifier = qualifiedIdentifier;
	}
	/**
	 * @return the qualifiedIdentifier
	 */
	public String getQualifiedIdentifier() {
		return qualifiedIdentifier;
	} 
}
