package com.exilant.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.exilant.day1.Customer;

// this program shall have the predicates for customer class 

public class CustomerPredicateEx {
	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(
				new Customer(101, "Ramu", 6000, "Engineer"), 
				new Customer(102, "Allahrakha", 6500, "Developer"), 
				new Customer(103, "Pooja", 4500, "Lead"), 
				new Customer(104, "Anuj", 5600, "Engineer"), 
				new Customer(105, "Tanmayee", 4000, "Developer"), 
				new Customer(105, "Naveen", 222, "Developer")

		); 

		Predicate<Customer> posivie5000Plus = c -> c.getCustomerPurchases() > 5000; 
		Predicate<Customer> engineers = c -> c.getDesignation().equals("Engineer"); 
		
		Predicate<Customer> predicate = posivie5000Plus.and(engineers); 
		List<Customer> filteredCustomers = filteredList(customers, predicate); 
		filteredCustomers.forEach(System.out  :: println);
	}
	
	
	
	
	public static List<Customer> filteredList(List<Customer> customers, 
			Predicate<Customer> predicate) {

		List<Customer> filteredList = new ArrayList<Customer>();

		for (Customer temp : customers) {
			
			if (predicate.test(temp)) {
				filteredList.add(temp);
			}
		}
		return filteredList;
	}
	
}
