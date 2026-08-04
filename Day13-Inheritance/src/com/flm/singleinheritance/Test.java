package com.flm.singleinheritance;

public class Test {

	public static void main(String[] args) {
		Parent p=new Parent();
		Child c=new Child();
		c.m1();
		c.m2();
		System.out.println("============");
		c.m1();
		c.m2();
		System.out.println("============");
		c.m1();
		c.m2();
		p.m1();
	}
}
/*Output:
	This is child class
	This is child class
	============
	This is child class
	This is child class
	============
	This is child class
	This is child class
	This is parent class
*/