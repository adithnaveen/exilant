package com.exilant.abstractfactory;

import org.w3c.dom.views.AbstractView;

public abstract class AbstractFactory {
	public abstract IVehicle getVehicle(String vehicle);
	public abstract IColor getColor(String color);
}

class ColorFactory extends AbstractFactory{

	@Override
	public IColor getColor(String color) {
		if(color.equals("blue")){
			return new Blue();
		}else if(color.equals("red")){
			return new Red();
		}
		return null;
	}

	// this shows working of adapter pattern 
	// this is also called filter pattern 
	@Override
	public IVehicle getVehicle(String vehicle) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class VehicleFactory extends AbstractFactory{

	@Override
	public IVehicle getVehicle(String vehicle) {
		if(vehicle.equals("car")){
			return new Car();
		}else if(vehicle.equals("truck")){
			return new Truck();
		}
		
		return null;
	}

	@Override
	public IColor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


