package com.Vehcle1;

import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean isprime=true;
		System.out.println("enter a Number: ");
		int n=sc.nextInt();
		
		if(n<2) {
			isprime=false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isprime=false;
				break;
			}
		}
		if(isprime) System.out.println("prime Number");
		else System.out.println("Not a Prime Number");
		
		
		
		sc.close();
	}

}
