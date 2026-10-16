package com.flm.abstraction;

public class Test {

	public static void main(String[] args) {
		Dog dog =new Dog();
		dog.food();
		dog.sound();
		dog.noOfLegs();
		System.out.println("============");
		Cat cat=new Cat();
		cat.food();
		cat.sound();
		cat.noOfLegs();
		System.out.println("============");
		Human human=new Human();
		human.food();
		human.sound();
		human.noOfLegs();
	}
}
