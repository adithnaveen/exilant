package com.test;

public class MyClass implements Interface1, Interface2 {

	@Override
	public void method2() {
	}

	@Override
	public void method1(String str) {
	}

	// you have to implement the method if not it would be compile 
	// time error 
	
	@Override
	public void log(String str){
		System.out.println("MyClass logging::"+str);
//		Interface1.print("abc");
	}
	
	
	
}