package com.flm.runtimepolymorphism;

public class Test {

	public static void main(String[] args) {
		TVRemote tv=new TVRemote();
		tv.turnOn();
		tv.increseVolume();
		ACRemote ac=new ACRemote();
		ac.turnOn();
		ac.increseTemperture();
	}
}
