package com.exilant.criteria;

public class Person {
	private String name; 
	private String martialStatus;
	private String sex;
	
	public Person(String name, String martialStatus, String sex) {
		super();
		this.name = name;
		this.martialStatus = martialStatus;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public String getMartialStatus() {
		return martialStatus;
	}
	public String getSex() {
		return sex;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", martialStatus=" + martialStatus + ", sex=" + sex + "]";
	} 
	
	
}
