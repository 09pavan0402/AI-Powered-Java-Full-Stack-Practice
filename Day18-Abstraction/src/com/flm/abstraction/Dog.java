package com.flm.abstraction;

public class Dog extends Animal{

	@Override
	void sound() {
		System.out.println("bow bow....");
	}

	@Override
	void food() {
		System.out.println("Biscuts");
	}
}
