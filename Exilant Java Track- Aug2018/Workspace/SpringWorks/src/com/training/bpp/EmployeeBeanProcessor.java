package com.training.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.training.employee.Employee;

// if you want spring to know this is post processor 
//  implements BeanPostProcessor, this way every bean 
// when create by spring has to go through this class 

// since this class can handle any class/s all are given 
// as object 

public class EmployeeBeanProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("**********postProcessAfterInitialization -  "+arg1+"**********");
		
		// this is the place to mutate the class 
		if(arg0 instanceof Employee) {
			Employee emp = (Employee) arg0; 
			emp.setEmpName(emp.getEmpName().toUpperCase());
			return emp; 
		}
		
		
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("*******postProcessBeforeInitialization-  "+arg1+"*****");
		return arg0;
	}
	
}
