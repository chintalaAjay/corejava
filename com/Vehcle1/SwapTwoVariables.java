package com.Vehcle1;

import java.util.Scanner;

public class SwapTwoVariables {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a: ");
		int a =sc.nextInt();
		System.out.println("enter b: ");
		int b=sc.nextInt();
		System.out.println("before swapping:  a :  "+a+"  b:  "+b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After swapping a: "+a+"  b: "+b);
		
		
		
		sc.close();
	}

}
