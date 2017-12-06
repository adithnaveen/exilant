package com.exilant.java8.day2;

import java.util.Arrays;
import java.util.List;

public class ConsumerClient01 {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person(101, "Sethu Raman"), 
				new Person(23, "Vaibhav Dubey"), 
				new Person(44, "Gupteshwari Sahu"), 
				new Person(27, "Shiva Mani Tripathi") 
		);
		
		// we are traversing with Consumer Interface Implementation
		MyConsumer print = new MyConsumer(); 
		persons.forEach(print);
	}
}
