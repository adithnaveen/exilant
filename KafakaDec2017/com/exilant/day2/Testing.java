package com.exilant.day2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Testing {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hello", "how", "are", "you");


		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("Value got is " +   t);
			}
			
		});
	}
}
