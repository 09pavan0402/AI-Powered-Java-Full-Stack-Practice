package com.flm.abstraction;

public class Human extends Omnivorus {

	@Override
	void sound() {
		System.out.println("Talk..");	
	}

	@Override
	void food() {
		System.out.println("rice");	
	}
}
