package com.flm.staticmethods;

public class ProductOfNumbers {

	public static void main(String[] args) {
		productOfNumbers(10, 2);
		int res1= productOfTwoNumbers(20, 3);
		System.out.println(res1);
		int res2= productOfTwoNumbers(20, 3);
		System.out.println(res2);
		productOfNumbers(res1, res2);
	}
	public static void productOfNumbers(int a,int b) {
		int c = a*b;
		System.out.println(c);
	}
	public static int productOfTwoNumbers(int a, int b) {
		int c = a*b;
		return c;
	}
}
