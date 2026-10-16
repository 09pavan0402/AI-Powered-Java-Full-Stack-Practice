package com.flm.programmingonarrays;

public class SwapArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		SwapArray rv=new  SwapArray();
		int[] rev=rv.revArr(arr);
		for(int i=0;i<rev.length;i++) {
			System.out.print(rev[i]+" ");
		}
	}
	int[] revArr(int[] arr) {
		
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		return arr;
	}

}
