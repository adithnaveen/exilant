package com.trainings.profile;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

// DEV - ORALCE,
@Profile("Development")
@Configuration
public class DevDatabaseConfig implements DatabaseConfig{

	@Override
	@Bean(name="dev")
	public DataSource createDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource(); 
		System.out.println("Creating Development Database Instance");
		
		/**
		 * You can set the parameters here 
		 */
		
		return dataSource; 
		
	}

}
