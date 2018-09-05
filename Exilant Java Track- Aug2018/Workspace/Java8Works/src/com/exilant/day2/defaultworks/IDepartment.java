package com.exilant.day2.defaultworks;

public interface IDepartment {
	public void workLocation() ; 
	
	default void noOfHrs() {
		System.out.println("The project demands to work only till 6PM");
	}
	
	public static void commonUtility() {
		System.out.println("All Employee have to pass Background Verification... ");
	}
}
