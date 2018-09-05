package com.exilant.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


// to show workinf of map and filter based on the customer type 
public class StreamMapEx02 {
	
	
	// syntax is upto jdk 1.7 
	
	public static List<PriorityCustomer> filterCustomers(List<Customer> customers){
		List<PriorityCustomer> priorityCustomers  = new ArrayList<>(); 
		
		for(Customer temp : customers) {
			if(temp.getCustomerPurchases()>5000) {
				priorityCustomers.add(new PriorityCustomer
							(temp.getCustomerId(), 
							 temp.getCustomerName(),
							 "Gold")); 
			}
		}
		
		return priorityCustomers; 
		
	}
	
	// in java 8 way 
	// to filter the customer as Silver, Gold, Platinum with map.  
	// if no condition is matched the null is returned. (optional )
	public static List<PriorityCustomer> filterCustomers1(List<Customer> customers){
	
		List<PriorityCustomer> priorityCustomers = customers.stream().map(temp -> {
			
//			
//			if(temp.getCustomerPurchases()>5000) {
//				return new PriorityCustomer(temp.getCustomerId(), 
//						temp.getCustomerName(), "Gold"); 
//			}
			
			
			return new PriorityCustomer(temp.getCustomerId(), 
					temp.getCustomerName(),
					temp.getCustomerPurchases()>0 && 
					temp.getCustomerPurchases()<3000?"Silver":
						temp.getCustomerPurchases()>3000 && 
						temp.getCustomerPurchases()<5000?"Gold":"Platinum"
					
					); 
//			return null;
		}).collect(Collectors.toList());
	
		return priorityCustomers; 
	}
	//////////////////////////////////////////////////////////////////
	public static List<PriorityCustomer> filterCustomers2(List<Customer> customers){

		return 
				customers.stream().filter(temp -> temp.getCustomerPurchases()>5000)
					.map(temp -> {
						return new PriorityCustomer(temp.getCustomerId(), 
								temp.getCustomerName(), "Gold");
					}).collect(Collectors.toList());
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(
				new Customer(101, "Ramu", 6000, "Engineer"), 
				new Customer(102, "Allahrakha", 6500, "Developer"), 
				new Customer(103, "Pooja", 4500, "Lead"), 
				new Customer(104, "Anuj", 5600, "Engineer"), 
				new Customer(105, "Tanmayee", 4000, "Developer"), 
				new Customer(105, "Naveen", 222, "Developer")

		); 
		
		filterCustomers(customers).forEach(System.out :: println);
		
		
		System.out.println("-------------------------------");
		filterCustomers1(customers).forEach(System.out :: println);
		
		System.out.println("----------- with Filter ------------------");
		filterCustomers2(customers).forEach(System.out::println);
	}
}








