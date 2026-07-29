package com.flm.stringsmethods;

public class StringsMethods {

	public static void main(String[] args) {
		String s1="pavan A ";
		System.out.println(s1.length());//find length of string
		System.out.println(s1.charAt(0));//find charecter at index
		String s2="kumar";
		String s3="pavaN";
		System.out.println(s1.concat(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.indexOf('m')); //returns -1 char not present in string
		System.out.println(s1.contains("av"));
		System.out.println(s1.startsWith("pavan"));
		System.out.println(s1.endsWith("A"));
		System.out.println(s1.trim());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.isEmpty());
		System.out.println(s1.isBlank());
		System.out.println(s1.replace('a', 'A'));
		System.out.println(s1.replaceFirst("Av", "aV"));
		System.out.println(s1.substring(0,4));
		System.out.println(s1.substring(4));
	}
}
