package com.scanner;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		System.out.println("enter id: ");
		int id=sc.nextInt();
		System.out.println("enter phone ");
		Long phone=sc.nextLong();
		sc.nextLine();
		System.out.println("enter street : ");
		String street=sc.nextLine();
		System.out.println("enter pincode : ");
		int pincode=sc.nextInt();
		System.out.println("name is :"+name);
		System.out.println("id is : "+id);
		System.out.println("phone number is: "+phone);
		System.out.println("street is : "+street);
		System.out.println("pincode is : "+pincode);
		
		sc.close();
	}

}
