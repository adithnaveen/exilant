package com.exilant.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMaxEx02 {

	
	// upto jdk 1.7 
	public static List<PriorityCustomer> filterCustomers(List<Customer> customers){
		List<PriorityCustomer> priorityCustomers = new ArrayList<PriorityCustomer>();
		
		
		for(Customer temp : customers){
			if(temp.getSalary() > 5000){
				priorityCustomers.add
					(new PriorityCustomer(
								temp.getCustId(), 
								temp.getCustName(), true));
				
				
			}
		}
		
		return priorityCustomers;
	}
	
	
	// java 8 way 
	public static List<PriorityCustomer> filterCustomer01(List<Customer> customers){
		List<PriorityCustomer> priorityCustomer = 
				customers.stream().map(temp -> {
					if(temp.getSalary() > 5000){
						return new PriorityCustomer(temp.getCustId(), temp.getCustName(), true);
					}
					return null;
				}).collect(Collectors.toList());
		
		return priorityCustomer;
	}
	
	

	// java 8 way 
	public static List<PriorityCustomer> filterCustomer02(List<Customer> customers){

		return 		
				customers.stream().filter(temp -> temp.getSalary() >5000).map(temp -> {
						return new PriorityCustomer(temp.getCustId(), 
								temp.getCustName(), true);
				}).collect(Collectors.toList());
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(
				
				new Customer(101, "Shiva", 5600, "SE"), 
				new Customer(102, "Seenu", 6666, "SSE"), 
				new Customer(103, "Kumar", 4500, "Tainer"), 
				new Customer(104, "Naveen", 2500, "Developer"), 
				new Customer(105, "Kanchan", 4500, "Tester") 
		);

		
		filterCustomers(customers).forEach(System.out :: println);
		System.out.println("----------In java 8 way ---------");
		
		filterCustomer01(customers).forEach(System.out :: println);
		
		System.out.println("----------In java 8 way without null ---------");
		
		filterCustomer02(customers).forEach(System.out :: println);
		
	}
	
}




























