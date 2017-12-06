package com.exilant.bridge;

public class BridgePattern {
	public static void main(String[] args) {
		Color redColor = new RedColor();
		Color blueColor = new BlueColor();
		
		Shape rightAngleTriangle = new Triangle(redColor);
		rightAngleTriangle.applyColor();
		
		Shape pentagon = new Pentagon(blueColor);
		pentagon.applyColor();
	}
}
