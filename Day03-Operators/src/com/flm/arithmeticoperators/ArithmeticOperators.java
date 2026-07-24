package com.flm.arithmeticoperators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 15;
		System.out.println(c);
		c = 16;
		int addition = a+b;
		System.out.println(addition);
		System.out.println(c);
		
		int subtraction = b-c;
		System.out.println(subtraction);
		
		int multiplication = b*c;
		System.out.println(multiplication);
		
		float d = 5.0f;
		float e = 2.0f;
		
		float division = d/e;
		System.out.println(division);
		
		float remainder = d%e;
		System.out.println(remainder);
		
		String name1 = "FLM";
		String name2 = "edutech";
		System.out.println(name1+name2);
		System.out.println(name1 + " " + name2); // string concatination
		
		System.out.println("a + b = " + addition); // add string to number
		int num = 10;
		System.out.println(num+10); //20
		System.out.println(num+10+num);//30
		System.out.println("num"+10);//num10 string + num = string
		System.out.println(10+"num"+10); //10num10
		System.out.println(10+10+"num"+10);//20num10
		System.out.println(10+10+"num"+10+10);//20num1010
		System.out.println(10+10+"num"+10+10+10);//20num101010
		System.out.println(10+10+10+"num"+10+10+10);//30num101010
		System.out.println(10+10+10+"num"+10.5+2.5);//30num10.52.5
	}

}
