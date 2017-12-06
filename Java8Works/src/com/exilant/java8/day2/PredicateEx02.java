package com.exilant.java8.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class PredicateEx02 {
	public static void main(String[] args) {
		Predicate<Integer> greaterThan = i -> i>10;
		
		System.out.println(greaterThan.test(3));
		
		///////////// to show +ve values from the array 
		List<Integer> integerList =   Arrays.asList(12, 3, 4, 5, 66, -44, -3, -12, 100); 

		
		Predicate<Integer> positive = i -> i>=0;
		Predicate<Integer> betweenRange = i -> i>10 && i<70;
		// we can also have grouped predicate with logical conditions 
		
		Predicate<Integer> positiveAndBetween  = positive.and(betweenRange);
		
		List<Integer> filteredList = filterList(positiveAndBetween, integerList);
		filteredList.forEach(System.out :: println);

	}
	
	public static List<Integer> filterList(Predicate<Integer> predicate, 
				List<Integer> integerList){
		List<Integer> filteredList = new ArrayList<Integer>();
		for(Integer temp : integerList){
			if(predicate.test(temp)){
				filteredList.add(temp);
			}
		}
		return filteredList;
	}
	
	
}
