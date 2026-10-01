package com.Abstraction;

abstract class Area{
	public abstract void area();
	public  void hi() {
		System.out.println("hi");
	}
}
class Rectangle extends Area{
	int length;
	int breadth;
	public Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	@Override
	public void area() {
		System.out.println("area of rectangle"+length*breadth);
		
	}
}

public class Example1 {
	public static void main(String[] args) {
		Rectangle r=new Rectangle(10, 20);
		r.area();
		r.hi();
	}

}
