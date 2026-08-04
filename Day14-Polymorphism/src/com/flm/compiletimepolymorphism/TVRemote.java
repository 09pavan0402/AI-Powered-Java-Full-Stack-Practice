
package com.flm.compiletimepolymorphism;
//method overloading
public class TVRemote {
	int volume;
	public void increseVolume() {
		this.volume++;
		System.out.println("current volume: "+volume);
	}
	public void increseVolume(int volume) {
		this.volume+=volume;
		System.out.println("current volume: "+this.volume);
	}
	
}
