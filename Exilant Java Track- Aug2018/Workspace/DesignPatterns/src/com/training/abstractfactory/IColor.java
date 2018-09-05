package com.training.abstractfactory;

public interface IColor {
	void paintCar();
}

class Red implements IColor{

	@Override
	public void paintCar() {
		System.out.println("Painting Color Red");
	}
}


class Blue implements IColor{
	@Override
	public void paintCar() {
		System.out.println("Painting color Blue ");
	}
	
}