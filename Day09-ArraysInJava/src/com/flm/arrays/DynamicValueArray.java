package com.flm.arrays;

import java.util.Scanner;

public class DynamicValueArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i< arr.length;i++) {
			System.out.println("Enter element "+i+" - index:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i< arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
