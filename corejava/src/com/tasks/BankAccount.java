package com.tasks;

public class BankAccount {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	public void setdeatails(int accountNumber,String accountHolder,double balance) {
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("Deposit success");
		System.out.println("updated balance: "+balance);
		
	}
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
			System.out.println("withdraw success");
			System.out.println("updated balance: "+balance);
		}
		else {
			System.out.println("Insufficient balance");
//			System.out.println("Avaliable balance : "+balance+" only");
		}
	}
	
	

}
