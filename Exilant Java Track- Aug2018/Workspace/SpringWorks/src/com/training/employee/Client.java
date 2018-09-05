package com.training.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.basics.HelloService;

public class Client {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring-context2.xml"); 
		
		AbstractApplicationContext context = 
			new ClassPathXmlApplicationContext
			("spring-context.xml", "spring-context2.xml"); 
		
		Employee employee = context.getBean("employee", Employee.class);
		
		System.out.println(employee.hashCode());
		System.out.println("Emp Id " + employee.getEmpId());
		System.out.println("Emp Name " + employee.getEmpName());
		System.out.println("Emp Salary " + employee.getEmpSal());
		
		System.out.println("-------------------------");
	
		HelloService service = (HelloService) 
					context.getBean("defaultHello"); 
		
		System.out.println(service.sayHello());
		
		
		
		context.registerShutdownHook(); 
		
	}
}
