package com.training.servicelocator;

public class Client {
	public static void main(String[] args) {
		Service dbService = ServiceLocator.getService("db");
		dbService.execute(); 
		System.out.println("---------------------------");
	
		dbService = ServiceLocator.getService("db");
		dbService.execute(); 
		
		
	}
}
