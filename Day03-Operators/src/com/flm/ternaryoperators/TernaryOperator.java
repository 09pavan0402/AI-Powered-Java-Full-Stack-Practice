package com.flm.ternaryoperators;

public class TernaryOperator {

	public static void main(String[] args) {
		int age = 18;
		String vote=(age >18)?"Can Vote":"Cannot Vote";
		System.out.println(vote);
		
		int n =-1;
		String res=(n >0)?"positive":(n<0)?"negetive":"Zero";
		System.out.println(res);
		
		int num =10;
		int res1= (num%5==0)?5:0;
		System.out.println(res1);
	}

}
