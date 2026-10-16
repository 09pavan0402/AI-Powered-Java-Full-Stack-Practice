package com.flm.blocks;

public class ParentBlock{
	ParentBlock(){
		System.out.println("This is parent constructor");
	}
	static {
		System.out.println("This is parent static block");
	}
	{
		System.out.println("This is parent instance block");
	}
}
