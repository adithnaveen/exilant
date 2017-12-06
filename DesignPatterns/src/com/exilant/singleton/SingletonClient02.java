package com.exilant.singleton;
// to show working of lazy singleton

class Company{
	private Company(){
		System.out.println("Company constructor called... ");
	}
	
	public static Company getInstance(Company company){
		if(company == null){
			return new Company();
		}

		return company;
	}
	
}

class Emp{
	 int empId;
	Company company; 
}

public class SingletonClient02 {
	public static void main(String[] args) {
		// this is not possible 
//		Company company = new Company();
		
		// here the instance is not loaded in jvm 
		Company company = null; 
		
		company = Company.getInstance(company);
		Emp e = new Emp();
		e.empId = 101; 
		e.company = company;
		
		Emp e1 = new Emp();
		e.empId = 102; 
		e.company = company;
		
		
		
	}
}
















