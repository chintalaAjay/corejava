package com.Abstraction;

abstract class Employee{
	String empName;
	int id;
	 abstract void calculateSalary();
	 void applyLeave() {
		 System.out.println("leave applied successfully");
	 }
	 public Employee(String empName,int id) {
		 this.empName=empName;
		 this.id=id;
	 }
	 
	 void getDeatails() {
		 System.out.println("Employee deatails  empName: "+empName+", emp id: "+id);	 
	 }
	
	
}

class FullTimeEmployee extends Employee{
	double basePay,benifits;
	public FullTimeEmployee(String empName,int id,double basePay,double benifits) {
		super(empName,id);
		this.basePay=basePay;
		this.benifits=benifits;
		
	}
	@Override
	public void calculateSalary() {
		System.out.println("Calculating salary basepay and benifits : $"+(basePay+benifits));
	}
	
}
class PartTimeEmployee extends Employee {
	double hourlyRate;
	int hoursWorked;
	public PartTimeEmployee(String empName,int id,double hourlyRate,int hoursWorked) {
		super(empName,id);
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}
	@Override
	public void calculateSalary() {
		System.out.println("Calculating salary: Hours worked × rate =	$"+(hourlyRate*hoursWorked));
	}
	
	
}

class Freelancer extends Employee{
	double projectPayment;
	public Freelancer(String empName,int id,double projectPayment) {
		super(empName,id);
		this.projectPayment=projectPayment;
	}
	@Override
	public void calculateSalary() {
		System.out.println("\"Calculating salary: Project payment = $ "+projectPayment);
	}
}

public class Example4 {
	public static void main(String[] args) {
		Employee e;
		e=new Freelancer("Ram", 3, 6000);
		e.applyLeave();
		e.calculateSalary();
		e.getDeatails();
	}

}
