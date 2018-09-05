package com.trainings.autowire;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	private String type; 
	
	public Camera() {
		System.out.println("creating camera " + this);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
