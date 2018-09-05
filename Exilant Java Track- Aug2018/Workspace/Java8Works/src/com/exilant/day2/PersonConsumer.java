package com.exilant.day2;

import java.util.function.Consumer;

public class PersonConsumer implements Consumer<Person>{

	@Override
	public void accept(Person t) {
		System.out.println("Person Id: " +t.getpId() +
							", Person Name: " + t.getName());
	}
}


class PrintConsumer{
	public static void  print(Person p) {
		System.out.println("Static -> " + p.getpId() +", " + p.getName());
	}
}