package com.training.abstractfactory;

public class Client {
	public static void main(String[] args) {
		AbstractFactory vehicleFactory = FactoryProducer.getFactory("vehicle"); 
		IColor redColor = FactoryProducer.getFactory("color").getColor("red"); 
			
		IVehicle fordCar = vehicleFactory.getVehicle("car"); 
		fordCar.move();  
		fordCar.speed(120);		
		fordCar.paint(redColor);

		System.out.println("------------------------------------------");
		
		IVehicle manTruck = vehicleFactory.getVehicle("truck"); 
		manTruck.move();
		manTruck.speed(65);
		manTruck.paint(redColor);
	}
}
