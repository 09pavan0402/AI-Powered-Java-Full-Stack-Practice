package com.flm.hierarchicalinheritance;

public class Test {

	public static void main(String[] args) {
		FuelCar fc=new FuelCar();
		EvCar ev=new EvCar();
		System.out.println(fc.fuelCapacity);
		System.out.println(fc.noOfWheels);
		System.out.println(fc.price);
		fc.drive();
		fc.fillFuel();
		fc.start();
		System.out.println("============");
		System.out.println(ev.bateryCapacity);
		System.out.println(ev.noOfWheels);
		System.out.println(ev.price);
		ev.chargeCar();
		ev.drive();
		fc.start();
	}
}
