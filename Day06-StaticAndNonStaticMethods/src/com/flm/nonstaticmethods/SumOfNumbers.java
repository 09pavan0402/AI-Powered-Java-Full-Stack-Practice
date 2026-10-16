package com.flm.nonstaticmethods;

public class SumOfNumbers {

	public static void main(String[] args) {
		SumOfNumbers add=new SumOfNumbers();
		add.sum();
		add.sum();
		add.addTwoNumbers(20, 5);//arguments
		add.addTwoNumbers(25, 5);//arguments
	}
	void sum() {
		int a=10;
		int b=30;
		int c= a+b;
		System.out.println(c);
	}
	void addTwoNumbers(int a, int b) { //parameters
		int c = a+b;
		System.out.println(c);
	}
}
