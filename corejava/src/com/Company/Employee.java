package com.Company;

public class Employee {
	private String empName;
	private int empId;
	private String desg;
	private double salary;
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	Employee(String empName,int empId,String desg,double salary){
		this.empName=empName;
		this.empId=empId;
		this.desg=desg;
		this.salary=salary;
	}

}
