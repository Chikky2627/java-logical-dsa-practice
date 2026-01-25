package com.MiniProjects.logic.VehicleSystemUsingPoly;
import java.util.Scanner;
public class VehicleMain {
  public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);  
	System.out.println("Select Vehicle Type:");
	System.out.println("=====================");
	System.out.println("1. Car");
	System.out.println("2. Bike");
	System.out.println("3. Truck");
	int VehicleType=sc.nextInt();
	System.out.println("Enter distance:");
	double distance=sc.nextDouble();
	Vehicle ve;
	if(VehicleType==1) {
		ve=new Car();
	}
	else if(VehicleType==2) {
		ve=new Bike();
	}
	else if(VehicleType==3) {
		ve=new Truck();
	}
	else {
		System.out.println("Invalid input");
		sc.close();
		return;
	}
		
	
  //ve.startVehicle();
  double  fare=ve.calculateFare(distance);
  System.out.println("Total fare:"+fare);
  ve.startVehicle();
}
}


