package com.trainings.autowire.annotation;

import org.springframework.stereotype.Component;

@Component(value="speaker")
public class Speaker {
	private String type; 
	private int volLevels; 
	
	
	public Speaker() {
		System.out.println("Creating Speaker " + this);
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getVolLevels() {
		return volLevels;
	}


	public void setVolLevels(int volLevels) {
		this.volLevels = volLevels;
	}
	
	
	
}
