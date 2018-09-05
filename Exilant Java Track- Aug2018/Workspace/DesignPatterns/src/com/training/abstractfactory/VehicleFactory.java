package com.training.abstractfactory;

public class VehicleFactory extends AbstractFactory {

	@Override
	public IVehicle getVehicle(String vehicle) {
		if(vehicle.equals("car")) {
			return new Car(); 
			
		}else if(vehicle.equals("truck")) {
			return new Truck(); 
		}
		return null;
	}

	// no implementation of color 
	@Override
	public IColor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
