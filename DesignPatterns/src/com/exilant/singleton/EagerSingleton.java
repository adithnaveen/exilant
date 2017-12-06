package com.exilant.singleton;

import java.io.Serializable;

// this class will be used for eager singleton
// the singleton says the object should have only 1 reference for 
// this we create class level variable(static) 
// lets make constructor as private such that use does not access 

// cons -> the instance will loaded in jvm even not created 
public class EagerSingleton implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1074517364373230509L;
	// since it is static there will be only 1 instance 
	private static final EagerSingleton instance = 
				new EagerSingleton();
	
	// create a private constructor which cannot be accessed outside 
	private EagerSingleton(){
		System.out.println("EagerSingleton - Constructor Called.. ");
	}
	
	
	
	
	// to get the instance, the public method is invoked 
	public static EagerSingleton getInstance(){
		return instance;
	}
	
	
	// to stop creating an object if already existing works only 
	// for OIS 
	
	protected Object readResolve(){
		return getInstance();
	}
	
	
	
	
	
	
	
	
	
	
	
}
