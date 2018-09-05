package com.training.mvc;

public class Client {
	public static void main(String[] args) {
		// this comes from DB or external resource 
		Employee model = retrive(); 
		
		StarView view = new StarView(); 
		
		EmployeeController controller = new EmployeeController(model, view);
		controller.updateView("star");
	}

	private static Employee retrive() {
		return new Employee(101, "Divya");
	}
}
