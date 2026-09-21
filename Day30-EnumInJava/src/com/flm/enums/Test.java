package com.flm.enums;

public class Test {

	public static void main(String[] args) {
		Day day=Day.MONDAY;
		System.out.println(day);
		StatusCodes code=StatusCodes.SUCCESS;
		System.out.println(code+" = "+code.getCode());
	}
}
