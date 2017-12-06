package com.exilant.js;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSTester02 {
	public static void main(String[] args)
			throws FileNotFoundException, ScriptException {
		
		
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
		
		nashorn.eval(new FileReader("library.js"));
		
		nashorn.eval("fnTest()");
		nashorn.eval("sayHello('Kumar')");
		
	}
}
