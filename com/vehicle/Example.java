package com.vehicle;

class Vehicle{
	String make ,model;
	int year;
	public Vehicle(String make,String model,int year){
		this.make=make;
		this.model=model;
		this.year=year;
		System.out.println("vehicle created");
		
	}
	public void displayInfo() {
		System.out.println("make by: "+make);
		System.out.println("model is : "+model);
		System.out.println("year of Manfucatured: "+year);
//		System.out.println("---------------");
	}
	
	
}
class Car extends Vehicle{
	int numberOfDoors;
	public Car(String make, String model, int year,int numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors=numberOfDoors;
		
	}
	public void displayCarInfo() {
		super.displayInfo();
		System.out.println("number of doors car has: "+this.numberOfDoors);
		System.out.println("---------------");

	}

		
}
class Truck extends Vehicle{
	double cargoCapacity;

	public Truck(String make, String model, int year,double cargoCapacity) {
		super(make, model, year);
		
		this.cargoCapacity=cargoCapacity;
	}
	public void displayTruckInfo() {
		super.displayInfo();
		System.out.println("cargo capacity "+this.cargoCapacity);
		System.out.println("---------------");

	}
	
}
class MotorCycle extends Vehicle{
	boolean  hasSidecar;
	public MotorCycle(String make,String model,int year,boolean  hasSidecar) {
		super(make,model,year);
		this.hasSidecar=hasSidecar;
		
	}
	public void displayMotorcycleInfo() {
		super.displayInfo();
		System.out.println("bike does has side car : "+this.hasSidecar);
		System.out.println("---------------");

	}
	
}


public class Example {
	public static void main(String[] args) {
		Vehicle car=new Car("Toyota", "corrolla", 2022, 4);
		car.displayInfo();
		((Car)car).displayCarInfo();
		Vehicle truck=new Truck("Ford", "F-150", 2021, 1000);
		truck.displayInfo();
		((Truck) truck).displayTruckInfo();
		Vehicle motorCycle=new MotorCycle("Hero", "splender", 2010, true);
		motorCycle.displayInfo();
		((MotorCycle) motorCycle).displayMotorcycleInfo();
		 
	}
	
}
