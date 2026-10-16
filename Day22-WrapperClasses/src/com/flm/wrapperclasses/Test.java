package com.flm.wrapperclasses;

public class Test {

	public static void main(String[] args) {
		int a=15;
		Integer b=new Integer(23);//this is not valid way
		Integer c=Integer.valueOf(12);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//auto boxing
		Integer d=Integer.valueOf(a);
		System.out.println(d);
		Integer num1=10;
		System.out.println(num1);

		//auto unboxing
		int f=d.intValue();
		System.out.println(f);
		int num2=num1;
		System.out.println(num2);
	}
}
