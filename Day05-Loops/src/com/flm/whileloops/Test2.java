package com.flm.whileloops;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println(num);
		while(num!=0) {
			System.out.println("Enter a number");
			int num2=sc.nextInt();
			System.out.println(num2);
		}

	}

}
