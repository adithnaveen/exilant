package com.exilant.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.exilant.day1.Customer;

// this program does same work as CustomerPredicateEx.java 
// except the filter has go in and the predicate is returned 
// with the help off the method called isEngineerGreterThan5k 
public class CustomerPredicateEx02 {
	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(
				new Customer(101, "Ramu", 6000, "Engineer"), 
				new Customer(102, "Allahrakha", 6500, "Developer"), 
				new Customer(103, "Pooja", 4500, "Lead"), 
				new Customer(104, "Anuj", 5600, "Engineer"), 
				new Customer(105, "Tanmayee", 4000, "Developer"), 
				new Customer(105, "Naveen", 222, "Developer")

		); 
		List<Customer> filteredCustomers = filteredList(customers, 
				isEngineerGreterThan5k()); 
		filteredCustomers.forEach(System.out  :: println);
	}
	
	 public static List<Customer> filteredList (List<Customer> customers, 
			 Predicate<Customer> predicate) {
	        return customers.stream().filter( predicate ).
	        		collect(Collectors.<Customer>toList());
	    }
	 public static Predicate<Customer> isEngineerGreterThan5k() {
		    return p -> p.getDesignation().equals("Engineer") && 
		    			p.getCustomerPurchases() > 5000; 
		}
	 
	 
	 
	 
	 
	 
	 
}
