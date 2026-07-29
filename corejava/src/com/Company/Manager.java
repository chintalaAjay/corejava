package com.Company;

public class Manager {
	
	private String managerName;
	Employee emp=new Employee("Ajay", 101, "dev", 50000);
	
	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	

	public static void checkDeatails(Employee emp) {
		if(emp.getSalary()>=30000 && emp.getSalary()<40000) {
			emp.setSalary(emp.getSalary()*1.15);
		} 
		else if(emp.getSalary()>=40000 && emp.getSalary()<=50000) {
			emp.setSalary(emp.getSalary()*1.10);
		}
		else if(emp.getSalary()>50000 && emp.getSalary()<=60000) {
			emp.setSalary(emp.getSalary()*1.05);
		}
		else {
			System.out.println("no hike..");
		}
		
		
	}

}
