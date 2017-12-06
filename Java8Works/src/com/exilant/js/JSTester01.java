package com.exilant.js;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSTester01 {
	public static void main(String[] args) throws ScriptException {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		
		ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
		String name = "Harry"; 
		Integer result = null;
		
		
		try {
			nashorn.eval("print('"+ name +"')");
			result = (Integer) nashorn.eval("10 + 20");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Result -> "+ result );
	}
}
