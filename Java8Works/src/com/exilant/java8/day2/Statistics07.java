package com.exilant.java8.day2;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Statistics07 {
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
		
		IntSummaryStatistics stats = dragons.stream()
				.mapToInt((x) -> x.getCount()).summaryStatistics(); 
		
		
		System.out.println("Sum is " + stats.getSum());
		System.out.println("Average is " + stats.getAverage());
		System.out.println("Max is " + stats.getMax());
		System.out.println("Min is " + stats.getMin());
		System.out.println("Count is " + stats.getCount());
	}
}
