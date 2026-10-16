package com.flm.twodimensionalarrays;

public class TwodimensionArray {

	public static void main(String[] args) {
		int[][] num=new int[2][2];
		num[0][0]=10;
		num[0][1]=20;
		num[1][0]=30;
		num[1][1]=40;
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(num[i][j]);
			}
		}
		System.out.println("=======================");
		int[][] arr= {{10,20}, {30,40}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
