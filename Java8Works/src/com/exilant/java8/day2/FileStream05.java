package com.exilant.java8.day2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FileStream05 {
	public static void main(String[] args) throws IOException {
//		Files.list(Paths.get(".")).map(Path:: getFileName)
//				.peek(System.out :: println)
//				.forEach(val -> doSomeAction(val));
		
//		List<String> list = Stream.of("one", "two", "three", "four", "")
//				.filter(e -> e.length()>3)
//				.peek(System.out :: println)
//				.map(String :: toUpperCase)
//				.peek(System.out :: println)
//				.collect(Collectors.toList());

		// to list the files with the extn as docx, and only 5 file names in sorted order 
		List<String> filesList = Files.list(Paths.get("."))
				.map(Path::getFileName)
				.map(Path:: toString)
				//  .peek(System.out :: println )
				.filter(name -> name.endsWith(".docx"))
				.peek(e -> System.out.println("Filtered Values " + e))
				.sorted()

				.limit(2)

				.collect(Collectors.toList());
		
		
		System.out.println("------------------------------");
		filesList.forEach(System.out :: println);
		
	}
	
	public static void doSomeAction(Path p){
		System.out.println("-------------------------------------");
		System.out.println("**** "+p.toString().toUpperCase() +" ****");
		System.out.println("-------------------------------------");
	}
}
