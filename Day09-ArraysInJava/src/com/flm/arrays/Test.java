package com.flm.arrays;

public class Test {

	public static void main(String[] args) {
		int[] marks=new int[5];
		marks[0]=100;
		marks[2]=300;
		marks[3]=400;
		marks[4]=500;
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		float[] weights= {23.34f,34.45f,56.0f};
		System.out.println(weights[0]);
		System.out.println(weights[1]);
		System.out.println(weights[2]);	
		String[] names= {"Pavan","Gopal","Kumar"};
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		names[1]="Ramu";
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
	}
}
