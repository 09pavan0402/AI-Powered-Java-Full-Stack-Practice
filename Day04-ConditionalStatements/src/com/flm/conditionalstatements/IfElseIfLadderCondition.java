package com.flm.conditionalstatements;

import java.util.Scanner;

public class IfElseIfLadderCondition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0) {
			System.out.println(num + " is Positive");
		}else if(num<0) {
			System.out.println(num +" is Negetive");
		}else {
			System.out.println(num +" is zero");
		}
		sc.close();
	}
}
