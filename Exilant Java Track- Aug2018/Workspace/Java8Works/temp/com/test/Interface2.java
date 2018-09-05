package com.test;

public interface Interface2 {

	void method2();
	
	default void log(String str){
		System.out.println("I2 logging::"+str);
	}
	
	
	static void utility() {
		System.out.println("The static utility method called.. ");
	}

}