package com.exilant.java8.day2;

import java.util.function.Consumer;

class Person{
	private int pId; 
	private String pName;

	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	

	public Person(){}
	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	} 
	
	
}



public class MyConsumer implements Consumer<Person>{

	@Override
	public void accept(Person arg0) {
		// you can do any job here and all objects are passed 
		// in the form of stream 1 by 1 
		System.out.println("------------- Person Details-----------");
		System.out.println("Pid -> " + arg0.getpId() +", PName -> " + arg0.getpName());
	}
	
}


class StringUpperCase implements Consumer<String>{

	@Override
	public void accept(String arg0) {
		System.out.println(arg0.toUpperCase());
	}
	
}














