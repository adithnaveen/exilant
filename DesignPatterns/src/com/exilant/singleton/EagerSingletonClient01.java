package com.exilant.singleton;

public class EagerSingletonClient01 {
	public static void main(String[] args) {
		EagerSingleton eInstance = EagerSingleton.getInstance();
		System.out.println(eInstance.hashCode());
		
		eInstance = EagerSingleton.getInstance();
		System.out.println(eInstance.hashCode());
		
		
		eInstance = EagerSingleton.getInstance();
		System.out.println(eInstance.hashCode());
		
	}
}
