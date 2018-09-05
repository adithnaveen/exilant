package com.trainings.autowire.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component


public class MobileAppConfiguration {
	@Bean(name="mobile")
	public Mobile getMobile() {
		return new Mobile(); 
	}
	
	@Bean(name="camera")
	public Camera getCamera() {
		return new Camera(); 
	}
	
	@Bean(name="screen")
	public Screen getScreen() {
		return new Screen(); 
	}
	
	@Bean(name="speaker")
	public Speaker getSpeaker() {
		return new Speaker(); 
	}
	
}

