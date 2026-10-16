package com.flm.superkeyword;

public class PursianCat extends Cat{
	int cost;
	public PursianCat(int cost) {
		this.cost=cost;
	}
	public PursianCat() {
		this(10);
		System.out.println("pursian cat object created");
	}
	void getCost() {
		System.out.println(super.age);
	}
}
