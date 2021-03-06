package com.training.servicelocator;

public class ServiceLocator {
	private static Cache cache; 
	
	static {
		cache = new Cache(); 
	}
	
	// db 
	public static Service getService(String jndiName) {
		Service service = cache.getService(jndiName);
		
		if(service!= null) {
			return service; 
		}
		
		InitialContext context = new InitialContext(); 
		Service nservice = (Service) context.lookup(jndiName); 
		cache.addService(nservice); 
		return nservice; 
		
	}
	
	
}
