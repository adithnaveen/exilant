package com.training.abstractfactory;

public abstract class AbstractFactory {
	// here you will have the list of factories to be exposed 
	
	public abstract IVehicle getVehicle(String vehicle); 
	public abstract IColor getColor(String color); 
	
}
