package com.flm.multipleinheritance;

public class C implements A,B{

	@Override
	public void m1() {
		System.out.println("child class m1 implementation");
		
	}

	@Override
	public void m3() {
		System.out.println("child class m3 implementation");
		
	}

	@Override
	public void m2() {
		System.out.println("child class m2 implementation");
		
	}
}
