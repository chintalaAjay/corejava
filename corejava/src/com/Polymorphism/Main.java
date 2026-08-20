package com.Polymorphism;

import java.util.Scanner;

class Plane{
	void fly() {
		
	}
	
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("cargo plane is fliying at low hights");
	}
	
}
class PassengerPlane extends Plane{
	
	@Override
	void fly(){
		System.out.println("passenger plane fliying at medium heights");
		
	}
}
class FighterPlane extends Plane{
	
	@Override
	void fly() {
		System.out.println("fighter plane flying at great heights");
		
	}
}


public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a plain: ");
		String p=sc.nextLine();
		
		
		
		
		
		sc.close();
	}

}
