package com.trainings.profile;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// this can even by done with xml 
//@ComponentScan(basePackages="com.trainings.profile")
@Configuration
public class AppConfig {
	@Autowired
	public DataSource dataSource; 
}
