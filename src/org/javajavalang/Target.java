package org.javajavalang;

public abstract class Target { 

	public abstract String getName(); 	

	public abstract String getTargetFileExtension();
	
	public abstract void registerTargetHandlers(GenerationObserver observer) throws Exception;

}
