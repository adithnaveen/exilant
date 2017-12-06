package com.exilant.servicelocator;

public class ServiceLocator {
	private static Cache cache;
	
	static{
		cache = new Cache();
	}
	
	public static Service getSerivce(String jndiName){
		Service service = cache.getSerivce(jndiName);
		
		if(service != null){
			return service;
		}
		
		// this is imaginary if the serivce is not there 
		// we can add the service to InitialContext 
		
		InitialContext context = new InitialContext();
		Service newService = (Service) context.lookup(jndiName);
		cache.addService(newService);
		return newService;
	}
	
}
