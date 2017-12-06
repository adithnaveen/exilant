package com.exilant.bridge;

public abstract class Shape {
	Color color; 
	
	public Shape(Color color){
		this.color = color;
	}
	
	public abstract void applyColor();
	
}
