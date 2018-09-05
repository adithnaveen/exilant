package com.training.facade;

public class FacadeCar {
	private HatchBack hbc; 
	private Sedan sedan; 
	private SUV suv; 
	
	public FacadeCar() {
		this.hbc = new HatchBack(); 
		this.sedan = new Sedan(); 
		this.suv = new SUV(); 
	}
	
	public void hatchBackDriver() {
		hbc.drive(); 
	}
	public void sedanDrive() {
		sedan.drive();
	}
	public void suvDrive() {
		suv.drive();
	}
}
