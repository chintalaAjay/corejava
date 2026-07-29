package com.Company;

public class Employee {
	private String empName;
	private int empId;
	private String desg;
	private double salary;
	Employee(String empName,int empId,String desg,double salary){
		this.empName=empName;
		this.empId=empId;
		this.desg=desg;
		this.salary=salary;
		System.out.println("employee deatails assigned");
		
	}

}
