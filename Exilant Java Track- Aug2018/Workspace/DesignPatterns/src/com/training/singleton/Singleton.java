package com.training.singleton;

import java.io.Serializable;

// the singleton says there should be only one object 
// to do so we will have the variable as static so that you can have only 
// one reference, in singleton we can have two types 
// 1. eager singleton 2. lazy singleton 

// (cons for eager singleton ) either the instance is needed or not 
// one copy is always kept in JVM. 
public class Singleton implements Serializable {
	
	private static final Singleton instance = new Singleton(); 
	
	
	// shall have the private constructor so that, it is not accessable outside 
	// the class 
	private Singleton() {
		System.out.println("The constructor is called");
	}
	
	// to get the instance public method is exposed 
	public static Singleton getInstance() {
		return  instance; 
	}
	
	// to stop creating an instance if already exists 
	// this is only for ObjectInputStream class 
	protected Object readResolve() {
		return getInstance(); 
	}
}








