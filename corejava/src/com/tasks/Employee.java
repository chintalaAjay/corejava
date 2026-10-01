package com.tasks;

public class Employee {
	public static String roles[]= {"Junior Developer","Developer","Senior Developer","Manager"};
	private int empid;
	private String name;
	private String designation;
	private double salary;
	private int performanceRating;
	
	public void setdeatails(int empid,String name,String designation,double salary,int performanceRating) {
		this.empid=empid;
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		this.performanceRating=performanceRating;
		
	}
	public void setdesignation(String designation) {
		this.designation=designation;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	
	public int getempid() {
		return empid;
	}
	public String getname() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public double getsalary() {
		return salary;
	}
	public int getperofrmanceRating() {
		return performanceRating;
	}
	public void getdeatails() {
		System.out.println("emp id : "+empid);
		System.out.println("emp name : "+name);
		System.out.println("designation : "+designation);
		System.out.println("salary : $"+salary);
		System.out.println("performance rating : "+performanceRating);
	}
	public void promoteEmployee() {
		if(performanceRating>=4) {
			System.out.println("Before Promotion: ");
			getdeatails();
			System.out.println("====================");
			if(findrole(designation, roles)<3) {
				designation=roles[findrole(designation, roles)+1];
				salary=salary+(0.2*salary);
				System.out.println("After Promotion: ");
				System.out.println("New Designation: "+getDesignation());
				System.out.println("Updated Salary: $"+getsalary());
				
			}
			else if(findrole(designation, roles)==3) {
				salary=salary+(0.2*salary);
				System.out.println("After Promotion: ");
				System.out.println("Designation: "+getDesignation());
				System.out.println("Updated Salary: $"+getsalary());
				
			}
			
		}
		else {
			System.out.println("Designation and salary remain unchanged.");
		}
		
	}
	public int findrole(String designation,String roles[]) {
		for(int i=0;i<roles.length;i++) {
			if(designation==roles[i]) {
				return i;
			}
		}
		return -1;
		
		
	}
	

}
