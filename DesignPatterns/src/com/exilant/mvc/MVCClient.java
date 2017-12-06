package com.exilant.mvc;

public class MVCClient {
	public static void main(String[] args) {
		Employee model = new EmployeeDAO().getEmployee();
		
		View view = View.getView(ViewName.STAR);
		
		EmployeeController controller = new EmployeeController(model, view);
		controller.updateView();

		controller.setView(View.getView(ViewName.DASH));
		
		model.setEmpName("Naveen Kumar");
		
		controller.updateView();
		
	}
}
