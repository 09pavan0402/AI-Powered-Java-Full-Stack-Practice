package com.flm.thiskeyword;

public class Animal {
	String name;
	int noOfLegs;
	int age;
	public Animal(String name, int noOfLegs,int age) {
		this.name=name;
		this.noOfLegs=noOfLegs;
	    this.age=age;
	}
	public void print() {
		System.out.println(this.name);
		System.out.println(this.noOfLegs);
		System.out.println(this.age);
	}
}
