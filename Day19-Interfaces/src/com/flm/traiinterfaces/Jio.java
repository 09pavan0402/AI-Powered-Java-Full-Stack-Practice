package com.flm.traiinterfaces;

public class Jio implements Trai{
	@Override
	public void callingSupport() {
		System.out.println("unlimited");
	}

	@Override
	public void networkSupport() {
		System.out.println("5G Data");
	}

	@Override
	public void smsSupport() {
		System.out.println("unlimited");
	}
	public void romming() {
		System.out.println("International roming");
	}
	public void ott() {
		System.out.println("OTT free");
	}
}
