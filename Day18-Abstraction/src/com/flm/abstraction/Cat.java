package com.flm.abstraction;

public class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("meo meo.....");
	}

	@Override
	void food() {
		System.out.println("milk");
	}
}
