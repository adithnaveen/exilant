package com.exilant.java8.day2;

public class Dragons {
	private String name; 
	private String country;
	private int count; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Dragons [name=" + name + ", country=" + country + "]";
	}
	public Dragons(){}
	
	public Dragons(String name, String country, int count) {
		super();
		this.count = count; 
		this.name = name;
		this.country = country;
	}
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
