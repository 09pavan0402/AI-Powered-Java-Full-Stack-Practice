package com.flm.logicaloperator;

public class LogicalOperator {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println(b1&&b2);//false
		System.out.println(b2&&b3);//false
		System.out.println(b3&&b4);//false
		System.out.println(b1&&b3);//true
		System.out.println(b2&&b4);//false
		System.out.println("=========================");
		System.out.println(b1||b2);//true
		System.out.println(b2||b3);//true
		System.out.println(b3||b4);//true
		System.out.println(b1||b3);//true
		System.out.println(b2||b4);//false
		System.out.println("=========================");
		System.out.println(!b1);
		System.out.println(!b2);
		System.out.println("=========================");
		System.out.println(b1&&b2&&b1);//false
		System.out.println(b1||b2||b1);//true
		System.out.println(b1&&b2||b1);//true
		System.out.println((b1&&b2||b1)&&b3);//true
		
	}

}
