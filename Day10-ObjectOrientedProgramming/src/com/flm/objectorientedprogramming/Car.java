package com.flm.objectorientedprogramming;

public class Car {

	String brand;
	String model;
	int noOfWheels;
	double price;
	String color;
	double mileage;
	int speed;
	int gare;
	void start() {
		System.out.println("Starting a car");
	}
	void changeGear(int value) {
		gare += value;
		System.out.println("Changing gear: "+gare);
	}
	void accelerate(int value) {
		speed +=value;
		System.out.println("Incresed speed: "+speed);
	}
	void brake(int value) {
		speed -=value;
		System.out.println("Decresed speed: "+speed);
	}
	
}
