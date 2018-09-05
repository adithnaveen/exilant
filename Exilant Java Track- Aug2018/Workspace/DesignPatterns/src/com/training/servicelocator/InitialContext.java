package com.training.servicelocator;

// this class will work for any service 
public class InitialContext {
	public Object lookup(String jndiName) { 
		if(jndiName.equalsIgnoreCase("db")) {
			System.out.println("looking for DB service and creating ");
			return new DBService(); 
		}else if(jndiName.equalsIgnoreCase("erp")) {
			System.out.println("Looking for ERP Service and create");
			return new ERPService(); 
		}
		
		return null;
	}
}
