package com.exilant.java8.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileOperation04 {
	public static void main(String[] args) throws IOException {
		// writeToFile();
			
		// readFromFile();
		
		// to generate 30 integers starting with 10.. if you take out 
		// limit then it will be infinite loop 
		Stream.iterate(10, i -> i+1).limit(30).forEach(System.out :: println);
		
		
	}

	private static void readFromFile() throws IOException, FileNotFoundException {
		// read the file content 
		// first way 
		try(
				FileReader fr = new FileReader("Sample1.txt");
				BufferedReader br = new BufferedReader(fr);
				){
			
			br.lines().forEach(System.out :: println);
			
		}
		
		// second way 
		System.out.println("--------------------------");
		try(Stream st = Files.lines(Paths.get("Sample1.txt"))){
			st.forEach(new StringUpperCase());
		}
	}

	private static void writeToFile() throws IOException {
		// earlier to jdk 1.8 
		BufferedWriter bw = null;
		try {
			 bw = new BufferedWriter(new FileWriter("Sample.txt"));

			bw.write("hello");
			bw.newLine();
			bw.write("Hi");
			bw.newLine();
			bw.write("bye");
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
		
		////////////////////////////////////////////
		
		// in java 8 way 
		
		try(
				BufferedWriter bw1 = new BufferedWriter(new FileWriter("Sample1.txt"));
				){

			bw1.write("This is from java8");
			bw1.newLine();
			bw1.write("with try without catch");
			bw1.newLine();
			bw1.write("look there is no catch here... ");
			bw1.newLine();
		}
		System.out.println("Written to file... ");
	}
}
