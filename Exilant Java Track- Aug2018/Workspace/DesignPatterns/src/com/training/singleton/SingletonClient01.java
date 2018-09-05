package com.training.singleton;

// this class shall show working of eager singleton 

public class SingletonClient01 {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance(); 
		
		// shall give the storage location 
		System.out.println(singleton.hashCode());
		
		singleton = Singleton.getInstance(); 
		
		// shall give the storage location 
		System.out.println(singleton.hashCode());
		
		
		singleton = Singleton.getInstance(); 
		
		// shall give the storage location 
		System.out.println(singleton.hashCode());
	}
}
