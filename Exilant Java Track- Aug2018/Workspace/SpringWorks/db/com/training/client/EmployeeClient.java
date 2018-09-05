package com.training.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.entity.Employee;
import com.training.interfaces.IEmployeeDAO;

public class EmployeeClient {
	public static void main(String[] args) {
		ApplicationContext context = new 
			ClassPathXmlApplicationContext("db-context.xml");
		
		
		IEmployeeDAO employeeDao = (IEmployeeDAO)
				context.getBean("employeeDaoTemplate");
		
		// insert employee 
		
//		Employee employee1 = new Employee(101, "Tanmayee", 40000); 
//		Employee employee2 = new Employee(102, "Goutam", 34000); 
//		Employee employee3 = new Employee(103, "Siddhart", 35000); 
//		Employee employee4 = new Employee(104, "Chandni", 36000); 
//
//		employeeDao.insertEmployee(employee1);
//		employeeDao.insertEmployee(employee2);
//		employeeDao.insertEmployee(employee3);
//		employeeDao.insertEmployee(employee4);
		
//		
//		Employee emp = employeeDao.getEmployee(101); 
//		System.out.println(emp);
//		
		
		
		List<Employee> list = employeeDao.getAllEmps();
		
		list.forEach(System.out :: println);
		
		
		
		
	}
}
