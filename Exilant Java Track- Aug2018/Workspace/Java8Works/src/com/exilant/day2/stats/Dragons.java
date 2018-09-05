package com.exilant.day2.stats;

public class Dragons {
	private String name; 
	private String country; 
	private int count;
	
	@Override
	public String toString() {
		return "Dragons [name=" + name + ", country=" + country + ", count=" + count + "]";
	}

	public Dragons() {}
	
	public Dragons(String name, String country, int count) {
		super();
		this.name = name;
		this.country = country;
		this.count = count;
	}
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	} 
	
	
	
}
