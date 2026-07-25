package com.flm.conditionalstatements;

import java.util.Scanner;

public class IfElseContion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%5==0) {
			System.out.println(num + " is Divisible by 5");
		}else {
			System.out.println(num +" is Not Divisible by 5");
		}
		sc.close();
	}
}
