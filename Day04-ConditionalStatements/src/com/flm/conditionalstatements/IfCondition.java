package com.flm.conditionalstatements;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0) {
			System.out.println("Number is Positive");
		}
		if(num<0) {
			System.out.println("Number is Negetive");
		}
		sc.close();
	}

}
