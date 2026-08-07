package com.flm.interfaces;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("eating biscuts...");
	}

	@Override
	public void walk() {
		System.out.println("walking in street..");
	}
}
