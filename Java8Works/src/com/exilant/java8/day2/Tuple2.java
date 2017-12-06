package com.exilant.java8.day2;

class Employee{
	public int empId; 
	public String empName;
	public Location location;
}

class Location{
	public String location;
}
class Tuple2<A, B >{
	private A _1; 
	private B _2; 
 
	
	public A get_1() {
		return _1;
	}
	public void set_1(A _1) {
		this._1 = _1;
	}
	public B get_2() {
		return _2;
	}
	public void set_2(B _2) {
		this._2 = _2;
	}
	 
	
	
	public Tuple2(A _1, B _2 ) {

		this._1 = _1;
		this._2 = _2;

	} 
	
	
}