package org.javajavalang;

import java.util.HashMap;


public class GenerationObserver {
	
	private Target target;
	
	private Generator generator; 
	
	private HashMap<String,RuleHandler> handlers = new HashMap<String, RuleHandler>();
	
	public GenerationObserver(Generator treeParser, Target target) throws Exception {
		this.generator = treeParser;		
		this.target = target;
		this.target.registerTargetHandlers(this);
	}

	public Generator getGenerator(){
		return generator;
	}
	
	public Target getTarget() {
		return target;
	}
	
	public String getTargetName()
	{
		return target.getName();
	}
	
	public void registerRuleHandler(RuleHandler handler) throws Exception
	{
		if (this.handlers.containsKey(handler.getName()))
			throw new Exception("Trying to register specific rule handler twice!");
		this.handlers.put(handler.getName(), handler);
		handler.register(this);
	}
	
	
	public boolean IsRuleHandled(String ruleName){
		return this.handlers.containsKey(ruleName);
	}
	
	public String generate(String ruleName, HashMap<String,Object> args)
	{
		// if no specific handler is registered return null
		if (this.handlers.containsKey(ruleName))
			return this.handlers.get(ruleName).handle(args);
		return null;
	}
}
