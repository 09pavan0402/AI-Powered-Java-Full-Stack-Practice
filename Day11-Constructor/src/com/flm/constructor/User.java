package com.flm.constructor;

public class User {
	int rollNo;
	int age;
	String name;
	public User(int a,int b, String userName) {
		rollNo=a;
		age=b;
		name=userName;
	}
	public User(String userName, int a, int b) {
		
	}
	public User(int a, int b) {
		
	}
	public User(int a) {
		
	}
	public User() {
		
	}
	public static void main(String[] args) {
		User obj=new User(10,20,"pavan");
		obj.rollNo=20;
		System.out.println(obj.rollNo);
		System.out.println(obj.age);
		System.out.println(obj.name);
		
	}
}
