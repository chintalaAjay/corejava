package com.Abstraction;


abstract class Vehicle{
	public abstract void startEngine();
	public void fuelType() {
		System.out.println("petrol");
	}
	public  String modelName,vehicleNumber,company;
}
class Car extends Vehicle{
	int numberOfDoors;
	boolean hasSonRoof;
	@Override
	public void startEngine() {
		System.out.println("car starts with key");
	}
	public Car(String modelName,String vehicleNumber,String company,int numberOfDoors,boolean hasSonRoof) {
		this.modelName=modelName;
		this.vehicleNumber=vehicleNumber;
		this.company=company;
		this.numberOfDoors=numberOfDoors;
		this.hasSonRoof=hasSonRoof;
		fuelType();
		startEngine();
		
	}
	
}
class Bike extends Vehicle{

	@Override
	public void startEngine() {
		System.out.println("start using kick or selfstart");
	}
	boolean hassideCar;
	public Bike(String modelName,String vehicleNumber,String company,boolean hasSideCar) {
		this.modelName=modelName;
		this.vehicleNumber=vehicleNumber;
		this.company=company;
		this.hassideCar=hasSideCar;
		fuelType();
		startEngine();
	}
	
	
}
class Truck extends Vehicle{

	@Override
	public void startEngine() {
		System.out.println("heavy load Engine warmup");
	}
	int cargoCapacity;
	@Override
	public void fuelType() {
		System.out.println("diesel");
	}
	public Truck(String modelName,String vehicleNumber,String company,int cargoCapacity) {
		this.modelName=modelName;
		this.vehicleNumber=vehicleNumber;
		this.company=company;
		this.cargoCapacity=cargoCapacity;
		fuelType();
		startEngine();
	}
	
}

public class Example2 {
	public static void main(String[] args) {
		Truck t=new Truck("volvo FH", "Ap2356", "Volvo", 400);
		
		
	}

}
