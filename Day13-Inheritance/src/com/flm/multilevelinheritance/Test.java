package com.flm.multilevelinheritance;

public class Test {

	public static void main(String[] args) {
		FuelCar fc=new FuelCar();
		System.out.println(fc.fuelCapacity);
		System.out.println(fc.noOfWheels);
		System.out.println(fc.price);
		fc.drive();
		fc.fillFuel();
		fc.start();
	}
}
