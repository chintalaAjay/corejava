package com.Scannertask;

public class BankApplication {
	String customerName;
	String customerAddress;
	long phone_num;
	double balance;
	BankApplication(String customerName,String customerAddress,long phone_num,double balance){
		this.customerName=customerName;
		this.customerAddress=customerAddress;
		this.phone_num=phone_num;
		this.balance=balance;
		
	}
	
	public void deposit(double amount) {
		if(amount<=0) {
			System.out.println("Invalid amount acceptss only positive numbers for deposit");
		}
		else {
			balance+=amount;
			System.out.println("deposited successfully");
			System.out.println("updated balance is : "+balance);
		}
		
	}
	
	public void withdraw(double amount) {
		if(amount<0 ) {
			System.out.println("Invalid withdrwal amount");
		}
		else if(amount>balance) {
			System.out.println("Insufficient funds");
		}
		else {
			balance-=amount;
			System.out.println("withdrwal success, remaining balance : "+balance);
			
		}
		
	}
	public void showBalance() {
		System.out.println("balance is :"+balance);
	}
	public void exit() {
		System.out.println("Thankyou ! ");
	}
	
	

}
