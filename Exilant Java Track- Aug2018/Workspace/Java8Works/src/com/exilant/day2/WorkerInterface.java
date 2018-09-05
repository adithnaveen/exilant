package com.exilant.day2;


@FunctionalInterface
public interface WorkerInterface {
	public void doSomeWork();
}



@FunctionalInterface
interface LargestString{
	public String accept(String s1, String s2);
}