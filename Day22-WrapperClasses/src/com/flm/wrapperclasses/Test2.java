package com.flm.wrapperclasses;

public class Test2 {

	public static void main(String[] args) {
		String s1="123";
		int num=Integer.parseInt(s1);
		System.out.println(num+1);
//		String s2="FLM";
//		int num2=Integer.parseInt(s2);
//		System.out.println(num2);
		int num1=123;
		String s2=String.valueOf(num1);
		System.out.println(s2+1);
		
		Character c1='a';
		System.out.println(Character.isLetter(c1));
		Character c2='2';
		System.out.println(Character.isDigit(c2));
		Character c3=' ';
		System.out.println(Character.isWhitespace(c3));
		Character c4='A';
		System.out.println(Character.toUpperCase(c4));
	}
}
