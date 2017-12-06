package com.exilant.servicelocator;

public class InitialContext {
	public Object lookup(String jndiName){
		if(jndiName.equalsIgnoreCase("mysql")){
			System.out.println("Lookup for Mysql called, getting service>>>> ");
			
			return new MySqlService();
		}else if(jndiName.equals("oracle")){
			System.out.println("Lookup for Oracle called, getting service>>>> ");
			
			return new OracleService();
		}
		
		return null;
	}
}
