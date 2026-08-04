package com.flm.runtimepolymorphism;

public class ACRemote extends Remote{
	int temp;
	public void increseTemperture() {
		this.temp++;
		System.out.println("current temp: "+this.temp);
	}
	public void turnOn() {
		System.out.println("Turn on AC remote...");
	}
}
