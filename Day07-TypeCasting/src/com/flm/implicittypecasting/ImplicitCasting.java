package com.flm.implicittypecasting;

public class ImplicitCasting { //also called widening type casting

	public static void main(String[] args) {
		byte a = 127;
		short b = a;
		System.out.println(b);
		int c = b;
		System.out.println(c);
		long d = c;
		System.out.println(d);
		double e=d;
		System.out.println(e);
		float f = d;
		System.out.println(f);
		char ch='A';
		System.out.println(ch);
		int charNum=ch;
		System.out.println(charNum);
		float charNum2=ch;
		System.out.println(charNum2);
		char ch2=23;
		System.out.println(ch2);
	}
}
