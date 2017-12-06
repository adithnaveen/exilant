package com.exilant.factory;

public class Car {
	public static Car getCar(CarName carName){
		
		
		
		if(carName.toString().equals("BMW")){
			return new BMW();
		}else if(carName.toString().equals("AUDI")){
			return new Audi();
		}else if(carName.toString().equals("TOYOTA")){
			return new Toyota();
		}
		

		return null;
	}

}




class BMW extends Car{
	public BMW() {
		System.out.println("BMW Car is Created... ");
	}
}
class Audi extends Car{
	public Audi() {
		System.out.println("Audi Car is Created... ");
	}
}
class Toyota extends Car{
	public Toyota() {
		System.out.println("Toyota Car is Created... ");
	}
}
