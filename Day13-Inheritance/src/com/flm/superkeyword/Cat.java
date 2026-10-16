package com.flm.superkeyword;

public class Cat extends Animal {
	String food;
	String color;
	int age=25;
	public Cat(String food, String color) {
		this.food=food;
		this.color=color;
	}
	public Cat() {
//		this("Milk","black"); //constructor chaining
//		super();
		System.out.println("cat object created");
	}
	void sound() {
		System.out.println(super.age);
		System.out.println(this.age);
		System.out.println(super.age);
		System.out.println(this.color+" cat sounds meow....");
	}
}
