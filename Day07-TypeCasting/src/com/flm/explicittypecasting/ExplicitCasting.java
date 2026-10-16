package com.flm.explicittypecasting;

public class ExplicitCasting { //also called Narrowing casting

	public static void main(String[] args) {
		short a = 128;
		byte b=(byte)a;
		System.out.println(b);//-128 when we force to add datatype cross outof range it return back so data lose
		short a1 = 256;
		byte b1=(byte)a1;
		System.out.println(b1);//0
	}
}
