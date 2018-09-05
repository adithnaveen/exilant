package com.training.singleton;
// this program to show working of lazy singletong 


class Company{
	private Company() {
		System.out.println("Constructor called.. ");
	}
	
	public static Company getInstance(Company company) { 
		if(company == null) {
			return new Company(); 
		}
		
		return company; 
	}
}

class Emp{
	int empId; 
	String empName; 
	Company company; 
}


public class SingletonClient02 {
	public static void main(String[] args) {
		// you cannot create an instance of variable 
		//Company company = new Company(); 
		
		Company company  = null; 
		
		company = Company.getInstance(company); 
		System.out.println(company.hashCode());
		
		
		Emp emp1 = new Emp(); 
		emp1.empId= 101; 
		emp1.empName= "Ankit"; 
		emp1.company = company; 
		System.out.println(emp1.company.hashCode());
		
		Emp emp2 = new Emp(); 
		emp2.empId= 102; 
		emp2.empName= "Akshay"; 
		emp2.company = company; 
		System.out.println(emp2.company.hashCode());
		
		
	}
}

















