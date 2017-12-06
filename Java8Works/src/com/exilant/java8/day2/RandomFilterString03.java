package com.exilant.java8.day2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RandomFilterString03 {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "har", "", "peet", "", "com");
		Predicate<String> predicate =  temp -> !temp.isEmpty();
		
		
////		List<String> filteredString = strings.stream().filter(temp -> !temp.isEmpty())
//									.collect(Collectors.toList());
		
		List<String> filteredString = strings.stream().filter(predicate)
				.collect(Collectors.toList());
		filteredString.forEach(System.out :: println);
		
		// generating random numbers 
		
		int randomNumber = ThreadLocalRandom.current().nextInt(100, 200);
		System.out.println(randomNumber);
		
		// getting random values between range 10 items and in ordered list 
		System.out.println("------------ 10 Random Numbers ---------");
		Random random = new Random();
		
		random.ints(10, 100, 200).forEach(System.out :: println);
		System.out.println("------------ 10 Random Numbers in sorted Order ---------");
		random.ints(10, 500, 700).sorted().forEach(System.out :: println);

	}
}






















