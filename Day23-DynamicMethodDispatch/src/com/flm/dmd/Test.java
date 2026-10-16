package com.flm.dmd;

public class Test {

	public static void main(String[] args) {
		Sim sim=new Airtel();
		Sim sim2=new Jio();
		System.out.println(sim.a);
		sim.calling();
	}
}
