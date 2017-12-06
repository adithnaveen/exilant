package com.exilant.mvc;

public class EmployeeDAO {
	// will hit to the database 
	
	public Employee getEmployee(){
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Kumar");
		return emp;
	}
}
