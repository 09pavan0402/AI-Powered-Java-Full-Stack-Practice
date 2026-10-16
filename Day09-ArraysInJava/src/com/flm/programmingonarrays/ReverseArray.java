package com.flm.programmingonarrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		 System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
	    System.out.println("Reversed Array:");

		ReverseArray rev = new ReverseArray();
		int[] reverse=rev.reverseArr(arr);
		for(int i=0;i<reverse.length;i++) {
			System.out.print(reverse[i]+" ");
		}
		sc.close();
	}
	public int[] reverseArr(int[] input) {
		int[] revArr=new int[input.length];
		int j=0;
		for(int i=input.length-1;i>=0;i--) {
			revArr[j]=input[i];
			j++;
		}
		return revArr;
	}
}
