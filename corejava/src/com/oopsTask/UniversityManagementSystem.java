package com.oopsTask;

import java.util.Scanner;

abstract class Employee{
	private String employeeId;
	private String name;
	abstract double calculateSalary();
	abstract void displayDetails();
	public Employee(String employeeId,String name) {
		this.employeeId=employeeId;
		this.name=name;
		
	}
	 protected void printBasicInfo() {
		 System.out.println("employee id: "+employeeId);
		 System.out.println("employee name: "+name);
		
		 
	 }
	 public String getEmployeeId() {
		 return employeeId;
	 }
	 public void setEmployeeId(String employeeId) {
		 this.employeeId = employeeId;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 
}
class FacultyMember extends Employee{
	private int departmentCode;
	private int yearsOfService;
	
	public FacultyMember(String employeeId,String name,int departmentCode,int yearsOfService){
		super(employeeId,name);
		this.departmentCode=departmentCode;
		this.yearsOfService=yearsOfService;
		
	}
	

	public int getDepartmentCode() {
		return departmentCode;
	}


	public void setDepartmentCode(int departmentCode) {
		this.departmentCode = departmentCode;
	}


	public int getYearsOfService() {
		return yearsOfService;
	}


	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}


	@Override
	double calculateSalary() {
		
		
		return (double)50000+(getYearsOfService()*1000);
	}

	@Override
	void displayDetails() {
		printBasicInfo();
		System.out.println("department code : "+getDepartmentCode());
		System.out.println("years of experience : "+getYearsOfService());
		
		
	}
	
}
class StaffMember extends Employee{
	private String designation;
	private double overtimeHours;
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getOvertimeHours() {
		return overtimeHours;
	}
	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	public StaffMember(String employeeId,String name,String designation,double overtimeHours) {
		super(employeeId,name);
		this.designation=designation;
		this.overtimeHours=overtimeHours;
		
	}
	@Override
	double calculateSalary() {
		
		return (double)40000+(25*getOvertimeHours());
	}
	@Override
	void displayDetails() {
		printBasicInfo();
		System.out.println("designation: "+getDesignation());
		System.out.println("over time hours: "+getOvertimeHours());
		
	}
	
}

public class UniversityManagementSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  employee id");
		String employeeId=sc.nextLine();
		System.out.println("Enter employee name: ");
		String name=sc.nextLine();
		System.out.println("Enter departmentcode: ");
		int departmentCode=sc.nextInt();
		System.out.println("Enter years of experience: ");
		int yearsOfService=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter designation: ");
		String designation=sc.nextLine();
		System.out.println("Enter over time hours: ");
		int overtimeHours=sc.nextInt();
		
		FacultyMember fc=new FacultyMember(employeeId, name, departmentCode, yearsOfService);
		fc.displayDetails();
		System.out.println("Monthly Salary: "+fc.calculateSalary());
		System.out.println("-------------------------");
		StaffMember sf=new StaffMember(employeeId, name, designation, overtimeHours);
		sf.displayDetails();
		System.out.println("Monthly Salary: "+sf.calculateSalary());
		
	}
	
	
	

}
