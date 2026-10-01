package com.Company;

import java.util.Scanner;

public class ManagerProcessor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter manager name: ");
		String managerName=sc.nextLine();
		System.out.println("enter employee name: ");
		String empName=sc.nextLine();
		System.out.println("enter employee id: ");
		int empId=sc.nextInt();
		System.out.println("enter employee desg: ");
		String empDesg=sc.nextLine();
		System.out.println("enter employee salary: ");
		double salary=sc.nextDouble();
		Manager man=new Manager();
		man.setManagerName(managerName);
		Employee emp=new Employee(empName, empId, empDesg, salary);
		System.out.println("emp name: "+emp.getEmpName());
		System.out.println("before promotion salary : "+emp.getSalary());
		man.checkDeatails(emp);
		System.out.println("updated salary: " + emp.getSalary());
		
		
		
		
		sc.close();
	}

}
