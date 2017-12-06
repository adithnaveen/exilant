package com.exilant.abstractfactory;

public interface IVehicle {
	void move();
	void speed(int maxSpeed);
}

class Car implements IVehicle{

	@Override
	public void move() {
		System.out.println("Car Moves with 4 Wheels ");
	}

	@Override
	public void speed(int maxSpeed) {
		System.out.println("The Max Speed of Car " + maxSpeed);
	}
	
}

class Truck implements IVehicle{

	@Override
	public void move() {
		System.out.println("Truck Moves with 6-8 Wheels");
	}

	@Override
	public void speed(int maxSpeed) {
		System.out.println("Max Speed of truck " + maxSpeed);
	}
	
}