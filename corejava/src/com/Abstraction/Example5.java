package com.Abstraction;


abstract class User{
	String username,email,role;
	abstract void accessDashboard();
	public void login() {
		System.out.println("login successfully..");
	}
	public void logout() {
		System.out.println("logout successfully..");
	}
	public void updateProfile() {
		System.out.println("profile updated successfully..");
	}
	public User(String username,String email,String role) {
		this.username=username;
		this.email=email;
		this.role=role;
	}
}

//class Student extends User{
//	String enrolledCoueses[];
//	int Grades;
//	
//}

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
