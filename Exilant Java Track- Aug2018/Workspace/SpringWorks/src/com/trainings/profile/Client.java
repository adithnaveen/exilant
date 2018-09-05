package com.trainings.profile;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(); 
		
		context
			.getEnvironment().setActiveProfiles
				("Production", "Development");
		
		// scans the mentioned package[s] and register all the 
		// components available in the given package below 
		
		context
			.scan("com.trainings.profile");

		context
			.refresh();
		
		context
			.close(); 
		
		
	}
}
