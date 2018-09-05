package com.exilant.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// program to show working of comparator with lambda 
public class LammdaSort05 {
	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(
				new Customer(101, "Ramu", 6000, "Engineer"), 
				new Customer(102, "Allahrakha", 6500, "Developer"), 
				new Customer(103, "Pooja", 4500, "Lead"), 
				new Customer(104, "Anuj", 5600, "Engineer"), 
				new Customer(105, "Tanmayee", 4000, "Developer"), 
				new Customer(105, "Naveen", 222, "Developer")
		); 
		
		System.out.println("-------------- Before Sort--------------------");
		customers.forEach(System.out:: println);
		
		// jdk1.7 or older version syntax 
		Collections.sort(customers, new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getCustomerName().compareTo(o2.getCustomerName());
			}
			
		});
		System.out.println("-------------- After Sort on Name(Asc) --------------------");
		customers.forEach(System.out:: println);
		
		
		// java 8 way 
		System.out.println("-------------- After Sort on purchase(Asc) --------------------");
		customers.sort((Customer c1, Customer c2)
					-> (int) (c1.getCustomerPurchases() - c2.getCustomerPurchases()) );
		customers.forEach(System.out:: println);

		// java 8 way 
		System.out.println("-------------- After Sort on designation (Asc) --------------------");
		customers.sort((c1, c2) -> c1.getDesignation().compareTo(c2.getDesignation()));
		customers.forEach(System.out:: println);

		Comparator<Customer> customerNameAscComparator = (c1, c2 ) -> 
			c1.getCustomerName().compareTo(c2.getCustomerName()); 
			
		Collections.sort(customers, customerNameAscComparator);
		System.out.println("-------------- After Sort on Name(Asc) --------------------");
		customers.forEach(System.out:: println);

		customers.sort(customerNameAscComparator.reversed());
		System.out.println("-------------- After Sort on Name(Desc) --------------------");
		customers.forEach(System.out:: println);
		

	}
}
















