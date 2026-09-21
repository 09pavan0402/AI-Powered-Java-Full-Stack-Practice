package com.flm.blocks;

public class Block extends ParentBlock{

	Block(){
		System.out.println("This is child constructor");
	}
	public static void main(String[] args) {
		
		System.out.println("This is child main method");
		Block test=new Block();
	}
	static {
		System.out.println("This is child static block");
	}
	{
		System.out.println("This is child instance block");
	}
}
