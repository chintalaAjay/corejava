package com.scanner;

import java.util.Scanner;

public class BankProcessor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name: ");
		String name=sc.nextLine();
		System.out.println();
		System.out.println("Enter your Address: ");
		String address=sc.nextLine();
		System.out.println("Enter phone number:");
		long phone_num=sc.nextLong();
		System.out.println("Enter your Intitial deposit amount");
		double balance=sc.nextDouble();
		
		
		BankApplication b=new BankApplication(name, address, phone_num, balance);
		System.out.println("Account Created Successfully!");
		boolean exit=false;
		do {
			System.out.println("1.withdraw  2.Deposit  3.Show balance  4.Exit");
			System.out.println("enter your option  [1-4] : ");
			int option=sc.nextInt();
			switch(option) {
			case 1:{
				System.out.println("enter amount to withdraw: ");
				double amount=sc.nextDouble();
				b.withdraw(amount);
				break;
			}
			case 2:{
				System.out.println("Enter amount to deposit");
				double amount=sc.nextDouble();
				b.deposit(amount);
				break;
			}
			case 3:{
				b.showBalance();
				break;
			}
			case 4:{
				b.exit();
				exit=true;
				break;
				
			}
			
			default:{
				System.out.println("Invalid option..");
				break;
			}
			}
			
		}
		while(!exit);
		sc.close();
		
	}

}
