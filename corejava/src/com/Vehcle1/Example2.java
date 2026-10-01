package com.Vehcle1;

import java.util.Scanner;

class InsurancePolicy{
	String CustomerName,	PolicyType,PolicyStatus;
	double ApprovedAmount,PolicyAmount;
	public InsurancePolicy(String CustomerName,String PolicyType,double PolicyAmount,double ApprovedAmount,String PolicyStatus) {
		this.CustomerName=CustomerName;
		this.PolicyType=PolicyType;
		this.PolicyAmount=PolicyAmount;
		this.ApprovedAmount=ApprovedAmount;
		this.PolicyStatus=PolicyStatus;
		System.out.println("policy record has been created...");
	}
	public void UpdateApprovedAmount(double updatedapprovedamount) {
		this.ApprovedAmount=updatedapprovedamount;
		System.out.println("Approved amount updated..");
		
	}
	public void ChangePolicyStatus(String updatedpolicystatus) {
		this.PolicyStatus=updatedpolicystatus;
		System.out.println("policystatus has been updated..");
	}
	public void show() {
		System.out.println("customer Name: "+CustomerName);
		System.out.println("policy Type: "+PolicyType);
		System.out.println("policyAmount : "+PolicyAmount);
		System.out.println("Approved Amount: "+ApprovedAmount);
		System.out.println("policyStatus: "+PolicyStatus);
	}
}
public class Example2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customerName: ");
		String CustomerName=sc.nextLine();
		System.out.println("Enter policy type: ");
		String PolicyType=sc.nextLine();
		System.out.println("Enter policyAmount: ");
		double policyAmount=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Approved Amount: ");
		double approvedAmount=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter policy status: ");
		String policyStatus=sc.nextLine();
		InsurancePolicy ip=new InsurancePolicy(CustomerName, PolicyType, policyAmount, approvedAmount, policyStatus);
		
		boolean exe=true;
		do {
			
			System.out.println("1.Update Approved Amount\r\n"
					+ "2.Change Policy Status\r\n"
					+ "3.View Policy Summary\r\n"
					+ "4.Exit the program");
			
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter updated Approved amount: ");
				double updatedapprovedamount=sc.nextDouble();
				sc.nextLine();
				ip.UpdateApprovedAmount(updatedapprovedamount);
				
				break;
			case 2:
				System.out.println("Enter changed policy staus: ");
				String updatedpolicyStatus=sc.nextLine();
				ip.ChangePolicyStatus(updatedpolicyStatus);
				break;
			case 3:
				ip.show();
				break;
			case 4:
				exe=false;
				System.out.println("thank you..");
				break;
			default:
				System.out.println("Invalid option ,please choose from (1-4)");
				break;
			}
			
		}
		while(exe);
		
		
		
		
		sc.close();
	}
	

}
