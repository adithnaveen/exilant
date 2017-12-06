package com.exilant.composite;

public class CompositeClient {
	public static void main(String[] args) {
		Customer customer1 = new Customer(101, "Harry1");
		Customer customer2 = new Customer(102, "Harry2");
		Customer customer3 = new Customer(103, "Harry3");
		Customer customer4 = new Customer(104, "Harry4");
		Customer customer5 = new Customer(105, "Harry5");
		Customer customer6 = new Customer(106, "Harry6");
		Customer customer7 = new Customer(107, "Harry7");
		Customer customer8 = new Customer(108, "Harry8");
		Customer customer9 = new Customer(109, "Harry9");
		
		customer1.addReference(customer2);
		customer1.addReference(customer3);
		customer1.addReference(customer4);
		
		System.out.println("Customer 1 Details \n" + customer1);
		System.out.println("-------------------------------------");
		customer1.getReference().forEach(System.out :: println);

		customer2.addReference(customer5);
		customer2.addReference(customer6);
		customer2.addReference(customer7);
		customer2.addReference(customer8);
		customer2.addReference(customer9);
		
		System.out.println("Customer 2 Details \n" + customer2);
		System.out.println("-------------------------------------");
		customer2.getReference().forEach(System.out :: println);
	}
}
