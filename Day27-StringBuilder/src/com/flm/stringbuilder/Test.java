package com.flm.stringbuilder;

public class Test {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("FLM");
		sb.append(" edutech");
		System.out.println(sb);
		sb.insert(3, '-');
		System.out.println(sb);
		sb.replace(3, 5, "-");
		System.out.println(sb);
		sb.delete(3, 11);
		System.out.println(sb);
		System.out.println(sb.reverse());
		StringBuilder sb2=new StringBuilder("Hello Java Programming");
		System.out.println(sb2.length()); //exceed capacity
		System.out.println(sb.capacity());
		sb2.append("!!");
		System.out.println(sb2.length());//new length *2
		System.out.println(sb2.capacity());
		
		StringBuilder sb3=new StringBuilder();
		sb3.append("Hello Java Programming");
		System.out.println(sb3.length()); //exceed capacity
		System.out.println(sb3.capacity());
		sb2.append("!!");
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());
		
//		String str=sb3;//not to append string builder to string
		String str1=sb3.toString();//by converting tostring method
	}
}
