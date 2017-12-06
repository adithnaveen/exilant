package com.exilant.criteria;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Client {
	public static void main(String[] args) {
		List<Person> persons = 
				Arrays.asList(

						new Person("Vivek", "single", "Male"),
						new Person("Seema", "married", "Female"),
						new Person("Leena", "single", "Female"),
						new Person("Vijay", "single", "Male"),
						new Person("Kumar", "married", "Male"),
						new Person("Peter", "single", "Male"),
						new Person("Tim", "married", "Male"),
						new Person("Zafrin", "single", "Female")
				);
		
		// criterias 
		Criteria male = new Male();
		Criteria female = new Female();
		Criteria single = new Single();
		
		Criteria andCriteria = new AndCriteria(female, single);
		Criteria orCriteria = new OrCriteria(male, single);
		
		System.out.println("---- Male List -----");
		List<Person> maleList = male.meetCriteria(persons);
		maleList.forEach(System.out :: println);
		
		System.out.println("---- Female List ------ ");
		List<Person> femalList = female.meetCriteria(persons);
		femalList.forEach(System.out :: println);
		
		System.out.println("---- Single List ------ ");
		single.meetCriteria(persons)
			.forEach(System.out :: println);

		System.out.println("---- And (female, single) ----");
		
		andCriteria.meetCriteria(persons)
			.forEach(new Consumer<Person>() {

				@Override
				public void accept(Person arg0) {
					System.out.println(arg0.toString().toUpperCase());
				}
			});
		
		System.out.println("------ OR (male, single )---------- ");
		orCriteria.meetCriteria(persons)
		.forEach(System.out :: println);
	}
}








