package com.flm.hybridinheritance;

public class D implements B,C{

	@Override
	public void m1() {
		System.out.println("m1() implements");	
	}

	@Override
	public void m3() {
		System.out.println("m3() implements");	
	}

	@Override
	public void m2() {
		System.out.println("m2() implements");	
	}

}
