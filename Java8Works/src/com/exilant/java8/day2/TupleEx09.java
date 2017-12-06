package com.exilant.java8.day2;

import java.util.ArrayList;
import java.util.List;

class MyTuple<A, B, C>{
	private A _1; 
	private B _2; 
	private C _3;
	
	
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
	public C get_3() {
		return _3;
	}
	public void set_3(C _3) {
		this._3 = _3;
	}
	
	
	public MyTuple(A _1, B _2, C _3) {
		super();
		this._1 = _1;
		this._2 = _2;
		this._3 = _3;
	} 
	
	
}

class Emp{}
class ClassRoom{}
class Nothing{}


public class TupleEx09 {
	
	public static MyTuple<String, Integer, Boolean> newTuple(){
		return new MyTuple("hello", 100, true);
	}
//	public static MyTuple<Emp, ClassRoom, Nothing> nonSense(){
//		
//	} 
	
	public static void main(String[] args) {
		MyTuple<String, Integer, Boolean> tuple = newTuple();
		
		System.out.println("_1 -> " + tuple.get_1());
		System.out.println("_2 -> " + tuple.get_2());
		System.out.println("_3 -> " + tuple.get_3());
		
		List<MyTuple<String, Integer, Boolean>> myList = new 
					ArrayList<MyTuple<String, Integer, Boolean>>();
		
		
		
	}
}
























