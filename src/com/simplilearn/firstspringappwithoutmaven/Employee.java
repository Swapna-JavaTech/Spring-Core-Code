package com.simplilearn.firstspringappwithoutmaven;

public class Employee {
	
	private String empName;
	
	//generate getters and setters

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void displayEmpInfo(){
		System.out.println("Employee Name = "+empName);
	}
	

}
