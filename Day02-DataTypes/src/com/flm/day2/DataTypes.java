package com.flm.day2;

public class DataTypes {

	public static void main(String[] args) {
		byte b = 127; //byte range -128 to 127
		short s = -32768;//short -32768 to 32767
		int i = 2345698; // int range -2^ 31 to 2^ 31-1 
		long l = 3236732230L; //long range -2^63 to 2^63-1
		
		float f = 234598.23455f; // 7-8 digits precision
		double d = 234598.23455234555556;  //16 digit precision
		
		char ch = 'A';
		boolean bol=true;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(bol);
		
	}

}
