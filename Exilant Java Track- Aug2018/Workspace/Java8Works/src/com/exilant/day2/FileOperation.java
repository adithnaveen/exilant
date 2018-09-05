package com.exilant.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {

	
	public static void main(String[] args) throws IOException {
		// writeToFile();
		// writeToFile01();
		readFromFile();
	}
	
	
	
	public static void writeToFile()  {
		// earlier to 1.8 
		
		BufferedWriter bw =  null ; 
		
		try {
				bw = new BufferedWriter(new FileWriter("Sample.txt"));
				
				bw.write("Hello");
				bw.newLine(); 
				bw.write("How are you today");
				bw.newLine();
				bw.write("Its nice weather in Bengaluru"); 
				bw.newLine();
				
				System.out.println("Data saved successfully... ");
		}catch(IOException ieo) {
			ieo.printStackTrace(); 
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}


	public static void writeToFile01() throws IOException {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("NewSample.txt"))){
			bw.write("Hello All");
			bw.newLine();
			bw.write("We are in Mission Road");
			bw.newLine();
			bw.write("In Bengaluru");
			bw.newLine();
		}
		
		System.out.println("Data Saved successfully.. ");
	}

	
	
	public static void readFromFile() throws IOException{
		
		try(
				FileReader fr = new FileReader("NewSample.txt"); 
				BufferedReader br = new BufferedReader(fr); 
			){

			br.lines().forEach(System.out :: println);

		}
	}
	
	
	
	

}







