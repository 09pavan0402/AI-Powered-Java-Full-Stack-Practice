package com.flm.compiletimepolymorphism;

public class Test {

	public static void main(String[] args) {
		TVRemote tv=new TVRemote();
		tv.increseVolume();
		tv.increseVolume();
		tv.increseVolume(5);
		tv.increseVolume();
	}

}
