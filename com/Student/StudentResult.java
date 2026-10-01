package com.Student;

public class StudentResult {
	private String studentName;
	private int studentId;
	private String courseName;
	private double totalMarks;
	public StudentResult(String studentName, int studentId, String courseName, double totalMarks) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.courseName = courseName;
		this.totalMarks = totalMarks;
		System.out.println("Student Record created succesfully");
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}
	public void addMarks(double marks) {
		if(marks<1) {
			System.out.println("Invalid marks entered");
			
		}
		else {
			totalMarks+=marks;
			System.out.println("marks updated successfully ,new Total marks: "+totalMarks);
			
		}
	}
	
	public void CalculateGrade() {
		if(this.totalMarks>=90) {
			System.out.println("Grade A");
		}
		else if(totalMarks>=80) {
			System.out.println("Grade B");
		}
		else if(totalMarks>=70) {
			System.out.println("Grade C");
		}
		else if(totalMarks>=60) {
			System.out.println("Grade D");
		}
		else if(totalMarks>0 && totalMarks<60) {
			System.out.println("Fail");
		}
		else {
			System.out.println("No marks availble to Calculate Grade minumum marks>1 && maximum marks<=100");
		}
	}
	

}
