package com.exilant.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EagerSingletonReflectionClient03 {
	public static void main(String[] args) 
			throws InstantiationException,
			IllegalAccessException, IllegalArgumentException, 
			InvocationTargetException {
		EagerSingleton instanceOne  = EagerSingleton.getInstance();
		EagerSingleton instanceTwo  = null;
		EagerSingleton instanceThree  = null;
		
		Constructor[] constructors = 
				EagerSingleton.class.getDeclaredConstructors();
		
		for(Constructor constructor: constructors){
			// here we can destroy singleton pattern 
			
			constructor.setAccessible(true);
			instanceTwo = (EagerSingleton) constructor.newInstance();
			instanceThree = (EagerSingleton) constructor.newInstance();
			break;
		}
		
		System.out.println("instanceOne - hashCode " + instanceOne.hashCode());
		System.out.println("instanceTwo - hashCode " + instanceTwo.hashCode());
		System.out.println("instanceThree - hashCode " + instanceThree.hashCode());
	}
}
