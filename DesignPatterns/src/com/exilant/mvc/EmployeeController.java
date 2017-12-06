package com.exilant.mvc;

public class EmployeeController {
	private Employee model;
	private View view;
	
	public EmployeeController(Employee model, View view){
		this.model= model;
		this.view = view; 
	}

	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}

	public Employee getModel() {
		return model;
	}

	public void setModel(Employee model) {
		this.model = model;
	}

	

	
	public void updateView(){
		view.printEmployee(model);
	}
	
}
