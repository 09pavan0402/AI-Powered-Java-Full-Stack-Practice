package com.flm.publicaccessmodifiers;

public class Test {
	int a;
	public void m1() {
		System.out.println("hii");
	}
	public static void main(String[] args) {
		
		Test t1=new Test();
		t1.m1();
		System.out.println(t1.a=10);
	}
}
