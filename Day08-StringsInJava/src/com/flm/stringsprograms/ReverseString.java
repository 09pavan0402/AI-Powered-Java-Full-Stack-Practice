package com.flm.stringsprograms;

public class ReverseString {

	public static void main(String[] args) {
		String s1="FlmEdutech";
		ReverseString rev = new ReverseString();
		String res=rev.reverse(s1);
		System.out.println(res);
	}
	String reverse(String s1) {
		String result ="";
		for(int i=s1.length()-1;i>=0;i--) {
			result += s1.charAt(i);
		}
		return result;
	}
}
