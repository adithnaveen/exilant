package com.exilant.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


class Delete{
	public void hi(){}
}
public class Lambda01BasicForLoop {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		// jdk 1.7 upto 
		for(int i=0; i<numbers.size(); i++){
			System.out.println(numbers.get(i));
		}
		
		System.out.println("------- from jdk 1.8------------");
		
		numbers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer arg0) {
				System.out.println("In Accept Val " + arg0);
			}
		});
		
		System.out.println("----- jdk 1.8 lambda (01)------");
		numbers.forEach((Integer temp ) -> System.out.println(temp) );
		
		
		System.out.println("----- jdk 1.8 lambda (02)------");
		numbers.forEach((temp ) -> System.out.println(temp) );
		
		// method reference 
		System.out.println("----- jdk 1.8 lambda (03)------");
		numbers.forEach(System.out :: println);
		
		int result = 0; 
		
		for(int temp : numbers){
			result += temp *2; 
		}
		System.out.println("Result " + result);
	
		System.out.println(numbers.stream().map(e -> e*2).reduce(2, (c, e)-> e+c ));
	}
}










