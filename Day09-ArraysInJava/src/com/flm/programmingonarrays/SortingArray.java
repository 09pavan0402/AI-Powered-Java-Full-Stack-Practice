package com.flm.programmingonarrays;

public class SortingArray {

	public static void main(String[] args) {
		int[] arr = {10, 24, 43, 1, 2, 4};
		for(int i=0;i<arr.length;i++) {
			for(int j=1; j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
