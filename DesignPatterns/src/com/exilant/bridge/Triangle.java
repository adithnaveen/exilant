package com.exilant.bridge;

// this class should have parametric constructor of color, since 
// parent has parametric constructor 

public class Triangle extends Shape{

	public Triangle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println("Triagle Filled with Color");
		color.applyColor();
	}
	
}
