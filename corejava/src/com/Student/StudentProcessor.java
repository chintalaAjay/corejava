package com.Student;

import java.util.Scanner;

public class StudentProcessor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Student id: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter course Name: ");
		String courseName=sc.nextLine();
		System.out.println("Enter first subject Marks: ");
		double marks=sc.nextDouble();
		StudentResult s1=new StudentResult(name, id, courseName, marks);
		
		boolean running=true;
		do {
			System.out.println("1. Add more subject marks\r\n"
					+ "2. Calculate grade\r\n"
					+ "3. View total marks\r\n"
					+ "4. Exit\r\n"
					+ " "+"please enter from [1-4]");
			int option=sc.nextInt();
			if(option==1) {
				System.out.println("Enter marks to add :");
				double smarks=sc.nextDouble();
				s1.addMarks(smarks);
			
	
			}
			else if(option==2) {
				s1.CalculateGrade();

			}
			else if(option==3) {
				System.out.println("Total marks: "+s1.getTotalMarks());

			}
			else if(option==4) {
				System.out.println("Thank You! Result Processing Completed.");
				running=false;

			}
			else {
				System.out.println("Invalid option");
			}
			
			
		}
		while(running);
		
		sc.close();
	}

}
