package com.exilant.day2;

import java.util.List;

import java.util.Arrays;

public class PersonClient {
	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(
				new Person(101, "Goutam"), 
				new Person(102, "Siddharth"), 
				new Person(103, "Chandini"), 
				new Person(104, "Rupa")
		);
		
		personList.forEach(System.out :: println);
		
		PersonConsumer print  = new PersonConsumer(); 
		
		personList.forEach(print);
		
		System.out.println("--------------------------- ");
		personList.forEach(PrintConsumer :: print);
		
	}
}
