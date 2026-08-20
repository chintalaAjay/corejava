package com.Vehcle1;

import java.util.Scanner;

class Vehicle{
	String OwnerName,VehicleNumber,VehicleType;
	public Vehicle(String OwnerName,String VehicleNumber,String VehicleType) {
		this.OwnerName=OwnerName;
		this.VehicleNumber=VehicleNumber;
		this.VehicleType=VehicleType;
		
	}	
}

class ServiceVehicle extends Vehicle {
	String ServiceCenterName,ServiceCategory;
	public ServiceVehicle(String OwnerName,String VehicleNumber,String VehicleType, String ServiceCenterName,String ServiceCategory) {
		// TODO Auto-generated constructor stub
		super(OwnerName,VehicleNumber,VehicleType);
		this.ServiceCenterName=ServiceCenterName;
		this.ServiceCategory=ServiceCategory;
		System.out.println("vehicle profile has been created...");
	}
	public void UpdateServiceCenteName(String ServiceCenterName) {
		this.ServiceCenterName=ServiceCenterName;
		System.out.println("Service center Name updated bro..");
	}
	public void UpdateServiceCategoryType(String ServiceCategory) {
		this.ServiceCategory=ServiceCategory;
		System.out.println("Service Category updated");
	}
	public void show() {
		System.out.println("Owner Name is: "+OwnerName);
		System.out.println("VehicleNumber is : "+VehicleNumber);
		System.out.println("vehicle Tpe is : "+VehicleType);
		System.out.println("ServiceCenterName is : "+ServiceCenterName);
		System.out.println("Service CategoryName is : "+ServiceCategory);
	}

}
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		ServiceVehicle sv=new ServiceVehicle("Ajay", "Ap1234", "4wheeler", "varahiservicecenter", "monthly");
		
		System.out.println("Enter Customer Name: ");
		String CustomerName=sc.nextLine();
		System.out.println("Enter Vehicle Number: ");
		String VehicleNumber=sc.nextLine();
		System.out.println("Enter Vehicle Type: ");
		String VehicleType=sc.nextLine();
		System.out.println("Enter Service Center Name: ");
		String ServiceCenterName=sc.nextLine();
		System.out.println("Enter Servce Category: ");
		String ServiceCategory=sc.nextLine();
		
		ServiceVehicle sv=new ServiceVehicle(CustomerName, VehicleNumber, VehicleType, ServiceCenterName, ServiceCategory);
		boolean exe=true;
		do {
			System.out.println("1.Update Service Category\r\n"
					+ "2.Update Service Center Name\r\n"
					+ "3.View Vehicle Profile Details\r\n"
					+ "4.Exit the program\r\n"
					+ "(1-4) Enter Any Number: ");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1:
					System.out.println("Enter updated service category: ");
					String servicecat=sc.nextLine();
					sv.UpdateServiceCategoryType(servicecat);
					break;
				case 2:
					System.out.println("Enter updated service Center Name: ");
					String servicenter=sc.nextLine();
					sv.UpdateServiceCenteName(servicenter);
					
					break;
				case 3:
					sv.show();
					break;
				case 4:
					exe=false;
					System.out.println("Thankyou for contacting us...");
					break;
				default:
					System.out.println("Invalid option ,please choose from (1-4)");
					break;
					
			}	
			
		}
		while(exe);
		
		sc.close();
		
	}
}


