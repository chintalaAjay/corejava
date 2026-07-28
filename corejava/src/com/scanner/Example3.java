package com.scanner;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name : ");
		String username=sc.nextLine();
//		sc.nextLine();
		System.out.println("Enter password: ");
		String password=sc.nextLine();
		int count=2;
		do{
			if(username.equals("admin@123") && password.equals("admin123")) {
				System.out.println("login successful..");
				break;
			}
			else {
				System.out.println("you have "+count+" attempts left");
				
				System.out.println("Enter user name : ");
				 username=sc.nextLine();
//				sc.nextLine();
				System.out.println("Enter password: ");
				password=sc.nextLine();
				if(username.equals("admin@123") && password.equals("admin123")) {
					System.out.println("login successful..");
					break;
				}
				count=count-1;
				
			}
			if(count==0) {
				System.out.println("you have 0 attempts left");
				System.out.println("try again after 24 hrs");
				break;
			}
			
		}
		while(true);
		sc.close();
	}

}
