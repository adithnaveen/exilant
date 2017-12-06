package com.exilant.mvc;

// we can have multiple views 

interface ViewName{
	String STAR ="star";
	String DASH = "dash";
}
abstract class  View {
	
	public abstract void printEmployee(Employee emp); 
	
	
	public static View getView(String viewType){
		if(viewType.equals("star")){
			return new EmployeeView();
		}else if(viewType.equals("dash")){
			return new EmployeeView1();
		}
		
		return null;
	}
}


 class EmployeeView extends View{
	public void printEmployee(Employee emp){
		System.out.println("*************************************");
		System.out.println(emp.getEmpId() +", " + emp.getEmpName());
		System.out.println("*************************************");
	}
}



 class EmployeeView1 extends View{


	@Override
	public void printEmployee(Employee emp) {
		System.out.println("-------------------------------------");
		System.out.println(emp.getEmpId() +", " + emp.getEmpName());
		System.out.println("-------------------------------------");	
	}
 }