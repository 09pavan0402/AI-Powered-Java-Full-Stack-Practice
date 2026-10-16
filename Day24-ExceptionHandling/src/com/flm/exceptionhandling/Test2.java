package com.flm.exceptionhandling;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int res2=divide();
		System.out.println(res2);
	}
	static int divide() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number1");
			int num1=sc.nextInt();
			System.out.println("Enter number2");
			int num2=sc.nextInt();
			int res=num1/num2;
			return res;
		}catch(Exception ex) {
			System.out.println("number not divide by zero");
			return 1;
		}
		finally {
			return 5;
		}
	}
}
