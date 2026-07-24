package com.flm.urinaryoperators;

public class UninaryOperators {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(-a);//-10
		int b= -5;
		System.out.println(-b); //5
		int c= 11;
		System.out.println(c++);//11
		System.out.println(c++);//12
		System.out.println(c++);//13
		int d = 12;
		System.out.println(++d);//13
		System.out.println(++d);//14
		System.out.println(--d);//13
		System.out.println(d--);//13
		System.out.println(d--);//12
		int num1 = 11;
		int num2 = 12;
		System.out.println(++num1 + ++num1 + num1++);//12 + 13 + 13 = 38
		System.out.println(--num2 + --num2 + num2-- + num2--);//11 + 10 + 10 + 9 = 40
		
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(!bool1);//false
		System.out.println(!bool2);//true	
	}

}
