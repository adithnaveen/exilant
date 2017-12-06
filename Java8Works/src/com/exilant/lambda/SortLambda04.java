package com.exilant.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortLambda04 {
	public static void main(String[] args) {
	List<Customer> customers = Arrays.asList(
				
				new Customer(101, "Shiva", 5600, "SE"), 
				new Customer(102, "Seenu", 6666, "SSE"), 
				new Customer(103, "Kumar", 4500, "Tainer"), 
				new Customer(104, "Naveen", 2500, "Developer"), 
				new Customer(105, "Kanchan", 4500, "Tester") 
		);
	
	
	Collections.sort(customers, new Comparator<Customer>() {

		@Override
		public int compare(Customer arg0, Customer arg1) {
			return arg0.getCustName().compareTo(arg1.getCustName());
		}
		
		
	});
	customers.forEach(System.out :: println);
	System.out.println("------------ in asc of Salary ------------- ");
	// in lambda way 
	customers.sort((Customer c1, Customer c2 ) ->  (int)(c1.getSalary() - c2.getSalary()));
	customers.forEach(System.out :: println);
	
	System.out.println("------------ in desc of Salary ------------- ");
	// in lambda way 
	// customers.sort(( c1,  c2 ) ->  (int)(c2.getSalary() - c1.getSalary()));
	
	Comparator<Customer> onName =  (a, b) -> a.getCustName().compareTo(b.getCustName());
	
	customers.sort(onName.reversed());
	
	Collections.sort(customers, onName);
	
	customers.forEach(System.out :: println);
	
	}
}










