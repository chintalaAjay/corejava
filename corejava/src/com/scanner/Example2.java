package com.scanner;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter gender: ");
		String gender=sc.next();
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		gender=gender.toLowerCase();
		if(gender.equals("female") && age>=23) System.out.println("eligible for vote");
		else if(gender.equals("male") && age>=27) System.out.println("eligible for vote");
		else System.out.println("Not eligible for vote");
		sc.close();
	}

}
