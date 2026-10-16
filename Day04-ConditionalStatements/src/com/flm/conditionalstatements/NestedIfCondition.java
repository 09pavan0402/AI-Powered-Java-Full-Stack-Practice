package com.flm.conditionalstatements;

import java.util.Scanner;

public class NestedIfCondition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("Do you have a valid licence give true / false");
			boolean hasLicence=sc.nextBoolean();
			if(hasLicence) {
				System.out.println("you can eligible drive a car");
			}
			else {
				System.out.println("you cannot eligible drive a car");
			}
		}else {
			System.out.println("Age is not support only above 18 years");
		}
		sc.close();
	}
}
