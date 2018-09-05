package com.training.servicelocator;

public class ERPService implements Service {

	@Override
	public String getName() {
		return "erp";
	}

	@Override
	public void execute() {
		System.out.println("Executing ERP Service");
	}
	
}
