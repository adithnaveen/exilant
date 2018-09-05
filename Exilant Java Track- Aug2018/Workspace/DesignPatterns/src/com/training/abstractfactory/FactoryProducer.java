package com.training.abstractfactory;


public class FactoryProducer {

	// if this method is not made static the every time the instance is 
	// created it is loaded in the heap which would run costly.
	// these kind of methods are called resource intensive 
	
	public static AbstractFactory getFactory(String factoryName) {
		if(factoryName.equals("vehicle")) {
			return new VehicleFactory(); 
		}else if(factoryName.equals("color")) {
			return new ColorFactory();
		}
		return null;
	}
}
