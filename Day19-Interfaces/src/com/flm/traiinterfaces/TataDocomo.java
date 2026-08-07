package com.flm.traiinterfaces;

public class TataDocomo implements Trai{

	@Override
	public void callingSupport() {
		System.out.println("1rs/1min");
	}

	@Override
	public void networkSupport() {
		System.out.println("2G Data");
	}

	@Override
	public void smsSupport() {
		System.out.println("100 sms in month");
	}
	
}
