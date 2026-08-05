package com.flm.protectedaccessmodifiers;

public class Test2 {

	public static void main(String[] args) {
		Test t1=new Test();
		t1.m1();
		System.out.println(t1.a=40);
	}
}
