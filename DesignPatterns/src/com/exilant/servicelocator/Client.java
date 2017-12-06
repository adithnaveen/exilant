package com.exilant.servicelocator;

public class Client {
	public static void main(String[] args) {
		Service mySqlDB = ServiceLocator.getSerivce("mysql");
		mySqlDB.executeService();
		
		System.out.println("-------------------");
		mySqlDB = ServiceLocator.getSerivce("mysql");
		mySqlDB.executeService();
		
		System.out.println("-------------------");
		mySqlDB = ServiceLocator.getSerivce("mysql");
		mySqlDB.executeService();
		
		Service oracleDB = ServiceLocator.getSerivce("oracle");
		oracleDB.executeService();
		
		System.out.println("-------------------");
		oracleDB = new ServiceLocator().getSerivce("oracle");
		oracleDB.executeService();
	
		System.out.println("-------------------");
		oracleDB = new ServiceLocator().getSerivce("oracle");
		oracleDB.executeService();
		
		System.out.println("-------------------");
		mySqlDB = ServiceLocator.getSerivce("mysql");
		mySqlDB.executeService();
		
	}
}
