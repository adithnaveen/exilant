package com.exilant.day2.stats;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DragonsClient {
	public static void main(String[] args) {
		// assume this is coming from DB 
		List<Dragons> dragonList = 
					Stream.of(
								new Dragons("Errol", "USA", 15), 
								new Dragons("Errol", "USA", 33), 
								new Dragons("Firnan", "USA", 5), 
								new Dragons("Hasai", "France", 12), 
								new Dragons("IceFire", "France", 3), 
								new Dragons("IceFire", "USA", 12) 
						).collect(Collectors.toList()); 
					
		
		// to find number of dragons 
		Map<String, Long> mapDragonCount = dragonList.stream()
				.collect(Collectors.groupingBy(Dragons :: getName, 
						Collectors.counting())); 
		
		System.out.println(mapDragonCount);
		
		// find the sum of dragons based on the name
		
		Map<String, Integer> sumOfDragons = dragonList.stream()
				.collect(Collectors.groupingBy(Dragons :: getName, 
						Collectors.summingInt(Dragons :: getCount))); 
		
		
		System.out.println("------ Report for sum of dragons-----------");
		sumOfDragons.forEach(
					(k,v)  -> {
							System.out.println("Dragon Name " + k 
									+", Number of Dragons " + v);
						});
		
		// TODO 
		// write a java 8 snippet to find the stats of the dragonList 
		// should display sum/average/min/max/avg of dragons, 
	
		
		IntSummaryStatistics stats = dragonList.stream().mapToInt(
					(x) -> x.getCount()
				).summaryStatistics();
		
		System.out.println("Sum is " + stats.getSum());
		System.out.println("Average is " + stats.getAverage());
		System.out.println("Max is " + stats.getMax());
		System.out.println("Min is " + stats.getMin());
		System.out.println("Count is " + stats.getCount());
		
		// 2. TODO 
		// find dragons by country and keep the names of dragons 
		// of different countries in the list/set 
		
					
	}
}






