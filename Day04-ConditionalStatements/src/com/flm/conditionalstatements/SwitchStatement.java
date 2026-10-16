package com.flm.conditionalstatements;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter floor no: ");
		int floor = sc.nextInt();
		switch(floor) {
		case 1:
			System.out.println("Reached 1st floor");break;
		case 2:
			System.out.println("Reached 2nd floor");break;
		case 3:
			System.out.println("Reached 3rd floor");break;
		case 4:
			System.out.println("Reached 4th floor");break;
		default:
			System.out.println("Invalid floor");
		}
		sc.close();
	}
}
