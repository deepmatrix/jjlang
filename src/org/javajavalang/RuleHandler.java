package org.javajavalang;

import java.util.HashMap;


public abstract class RuleHandler {

	public RuleHandler(String name)
	{
		this.name = name;
	}
	
	private String name;


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	private GenerationObserver observer = null;
	
	public void register(GenerationObserver observer)
	{
		this.observer = observer;
	}
	
	public boolean IsRegistrated(){
		return this.observer != null;
	}
	
	public abstract String handle(HashMap<String, Object> args);
}
