package com.MiniProjects.logic.VehicleSystemUsingPoly;

public class Car  extends Vehicle{
	@Override
	void startVehicle() {
		System.out.print("car is starting...");
	}
	@Override
	double calculateFare(double distance) {
		return distance*15;
	}

}
