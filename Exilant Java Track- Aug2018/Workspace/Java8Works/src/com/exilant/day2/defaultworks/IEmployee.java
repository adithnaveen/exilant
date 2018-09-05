package com.exilant.day2.defaultworks;

public interface IEmployee {
	public void salary(); 
	
	public default void noOfHrs() {
		System.out.println("Every employee has to work for 8 hrs");
	}
}
