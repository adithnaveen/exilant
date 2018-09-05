package com.traingin.factory;

public abstract class Car {
	public static Car getCar(CarName carName) {
		if(carName == CarName.MARUTI) {
			return  new Maruti(); 
		}else if(carName == CarName.BMW) {
			return new BMW(); 
		}else if(carName == CarName.AUDI) {
			return new Audi(); 
		}
		return null;
	}
	
	public abstract void drive(); 
}
