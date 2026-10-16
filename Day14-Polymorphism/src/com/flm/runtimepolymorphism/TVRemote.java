package com.flm.runtimepolymorphism;
//method overridding
public class TVRemote extends Remote{
	int volume;
	public void increseVolume() {
		this.volume++;
		System.out.println("current volume: "+volume);
	}
	public void increseVolume(int volume) {
		this.volume+=volume;
		System.out.println("current volume: "+this.volume);
	}
	
	public void turnOn() {
		System.out.println("Turning on samsung tv...");
	}
}
