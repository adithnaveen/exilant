package com.exilant.abstractfactory;

public class Client {
	public static void main(String[] args) {
		// this is 1 time 
		AbstractFactory vehicleFactory = FactoryProducer.getFactory("vehicle");
		
		IVehicle ford = vehicleFactory.getVehicle("car");
		ford.move();
		ford.speed(120);
		
		IVehicle truck = vehicleFactory.getVehicle("truck");
		truck.move();
		truck.speed(60);
		
		IColor redColor = FactoryProducer.getFactory("color").getColor("red");
		redColor.paintCar();
		
	
	}
}
