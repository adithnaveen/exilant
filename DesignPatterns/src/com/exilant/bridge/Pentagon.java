package com.exilant.bridge;

public class Pentagon extends Shape{

	public Pentagon(Color color) {
		super(color);
		
	}

	@Override
	public void applyColor() {
		System.out.println("Applying Color to Pentagon");
		color.applyColor();
	}
}
