package com.training.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("Lohit", "male", "single")); 
		list.add(new Person("Ramana", "male", "single")); 
		list.add(new Person("Kumar", "male", "married")); 
		list.add(new Person("Kavita", "female", "single")); 
		list.add(new Person("Subhashree", "female", "single")); 
		list.add(new Person("Joshna", "female", "married")); 
		list.add(new Person("Priya", "female", "married")); 
		list.add(new Person("Vinod", "female", "married")); 

		ICriteria maleCriteria = new Male(); 
		ICriteria singleCriteria = new Single(); 
		ICriteria marriedCriteria = new Married(); 
		ICriteria femaleCriteria = new Female(); 
		
		
		System.out.println("----------------Only Male---------------");
		maleCriteria.meetCriteria(list).forEach(System.out :: println);
		
		System.out.println("------------ Only Single ---------------");
		
		singleCriteria.meetCriteria(list).forEach(System.out :: println);
		
		System.out.println("------------- Male and Single -----------------");
		ICriteria andCriteria = new AndCriteria(maleCriteria, singleCriteria);
		andCriteria.meetCriteria(list).forEach(System.out :: println);
		
		System.out.println("------------- Male Or Married -----------------");
		ICriteria OrCriteria = new OrCriteria(maleCriteria, marriedCriteria);
		OrCriteria.meetCriteria(list).forEach(System.out :: println);
		
	}
}
