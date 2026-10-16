package com.flm.programmingonarrays;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40};
		System.out.println(Arrays.toString(arr));
		String str="Front Line Media";
		String[] res=str.split(" ");
		System.out.println(Arrays.toString(res));
		String str2="Front-Line-Media";
		String[] res2=str2.split("-");
		System.out.println(Arrays.toString(res2));
		String str3="FrontLineMedia";
		String[] res3=str3.split("");
		System.out.println(Arrays.toString(res3));
	}

}
