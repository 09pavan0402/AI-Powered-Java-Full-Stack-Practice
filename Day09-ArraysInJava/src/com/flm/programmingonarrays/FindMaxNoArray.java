package com.flm.programmingonarrays;

public class FindMaxNoArray {

	public static void main(String[] args) {
		int[] arr= {10,-2,20,6,30,3,-1,1};
		FindMaxNoArray maxOfArray=new FindMaxNoArray();
		int max=maxOfArray.findMax(arr);
		System.out.println(max);
	}
	public int findMax(int[] input) {
		int max=input[0];
		for(int i=0;i<input.length;i++) {
			if(input[i]>max) {
				max=input[i];
			}
		}
		return max;
	}

}
