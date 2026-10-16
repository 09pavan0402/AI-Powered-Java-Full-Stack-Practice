package com.flm.objectorientedprogramming;

public class Test {

	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.brand="Tata";
		c1.model="sierra";
		c1.color="Black";
		
		System.out.println(c1.brand);
		System.out.println(c1.model);
		System.out.println(c1.color);
		
		Car c2=new Car();
		c2.brand="Tata";
		c2.model="sierra";
		c2.color="Blue";
		
		System.out.println(c2.brand);
		System.out.println(c2.model);
		System.out.println(c2.color);
		
		c1.start();
		c1.changeGear(1);
		c1.accelerate(15);
		c1.changeGear(1);
		c1.accelerate(15);
		c1.accelerate(15);
		c1.brake(10);
		c1.changeGear(-1);
	}
}
