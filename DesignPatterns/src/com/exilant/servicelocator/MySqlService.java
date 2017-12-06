package com.exilant.servicelocator;

public class MySqlService implements Service{

	@Override
	public String getName() {
		return "MySQL Service";
	}

	@Override
	public void executeService() {
		// they load the xml and get the properties 
		System.out.println("MySqlService Loading xml .... ");
	}

}
