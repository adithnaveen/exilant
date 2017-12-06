package com.exilant.abstractfactory;

public interface IColor {
	void paintCar();
}

class Red implements IColor{

	@Override
	public void paintCar() {
		System.out.println("Car painting with Red Color");
	}
	
}

class Blue implements IColor{

	@Override
	public void paintCar() {
		System.out.println("Car painting with Blue Color");
	}
	
}