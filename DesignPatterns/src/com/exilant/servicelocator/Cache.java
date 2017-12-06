package com.exilant.servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
	private List<Service> services;
	
	public Cache(){
		services = new ArrayList<Service>();
	}
	
	// to get the cached services 
	
	public Service getSerivce(String serviceName){
		for(Service service: services){
			if(service.getName().equalsIgnoreCase("mysql")){

				System.out.println("Returning Cached Serivce " + service.getName());
				// make a note we are not creating the object 
				// of any serivce
				return service;
			
			}
		}
		return null;
	}

	// we dont have to cache all the services rather 
	// we can cache only required one 
	
	public void addService(Service newSerivce){
		
		boolean exists = false;
		for(Service service : services){
			if(service.getName().equals(newSerivce.getName())){
				exists = true;
			}
		}
		
		if(!exists){
			try  {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			services.add(newSerivce);
		}
		
	}

}














