package com.training.interfaces;

import java.util.List;

import javax.sql.DataSource;

import com.training.entity.Employee;

public interface IEmployeeDAO {
	// CRUD Operations 
	
	
	public Employee getEmployee(int empId); 
	
	public List<Employee> getAllEmps(); 
	
	public void insertEmployee(Employee employee); 
	
	public void deleteEmployee(int empId); 
	
	public void updateEmployee(int empId, double empNewSalary); 
	
	// datasouce shall be inject from .xml file to the implementation 
	// class and that is mandate.  
	// the variable name dataSource
	public void setDataSource(DataSource dataSource); 
	
}
