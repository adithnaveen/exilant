package com.exilant.factory;

public class CarClient {
	public static void main(String[] args) {
		Car bmw = Car.getCar(CarName.AUDI);
	}
}
