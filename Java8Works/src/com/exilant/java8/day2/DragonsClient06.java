package com.exilant.java8.day2;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DragonsClient06 {
	public static void main(String[] args) {
		List<Dragons> dragons = 
		  Stream.of(
				new Dragons("Errol", "USA", 12), 
				new Dragons("Errol", "USA", 22), 
				new Dragons("Firnan", "USA", 34), 
				new Dragons("Hasai", "France", 45), 
				new Dragons("IceFire", "France", 3)
				)
		  .collect(Collectors.toList());
		
		// dragons.forEach(System.out :: println);

		Map<String, Long> counting = dragons.stream()
				.collect(Collectors.groupingBy(Dragons::getName, Collectors.counting()));
		
		System.out.println(counting);
		
		Map<String, Integer> sum = dragons.stream()
				.collect(Collectors.groupingBy
						(Dragons:: getCountry, Collectors.summingInt(Dragons :: getCount)));
		
		System.out.println(sum);
		

		
		sum.forEach((k,v) -> System.out.println("Key : " + k +", Value : " + v));
		
		
		System.out.println("--------------------------------");
		// Country : USA, Dragons : [Errol, Firnan]
		// Country : France, Dragons : [Hasai, IceFire]

		Map<String, Set<String>> summarizeResult = 
		dragons.stream().collect(Collectors.groupingBy(Dragons :: getCountry, 
				Collectors.mapping(Dragons:: getName, Collectors.toSet())));
		
		
		summarizeResult.forEach((k,v) ->
			System.out.println("Country : " + k +", Dragons : " + v));
		
		
		
		
		
		
		
		
		
		
		
	}
}
