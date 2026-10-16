package com.flm.varargs;

public class MyClass {

	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
	}
	
	public static void add(int... nums) {
		int sum=0;
		for(int num: nums) {
			sum+=num;
		}
		System.out.println(sum);
	}
}
