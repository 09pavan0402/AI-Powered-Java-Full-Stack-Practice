package com.flm.objectclass;

public class Test {

	public static void main(String[] args) {
		Student std=new Student(101,"pavan");
		Student std2=new Student(102,"gopal");
		Student std3=new Student(101,"pavan");
		boolean isEqual=std.equals(std2);
		System.out.println(isEqual);
		boolean isEqual2=std.equals(std3);
		System.out.println(isEqual2);
		
		int st1HashCode=std.hashCode();
		int st2HashCode=std2.hashCode();
		int st3HashCode=std3.hashCode();

		System.out.println(st1HashCode);
		System.out.println(st2HashCode);
		System.out.println(st3HashCode);
		
		System.out.println(std);
		System.out.println(std2);
	}
}
