package com.flm.traiinterfaces;

public class Airtel implements Trai{
	@Override
	public void callingSupport() {
		System.out.println("100rs/100calls");
	}

	@Override
	public void networkSupport() {
		System.out.println("3G Data");
	}

	@Override
	public void smsSupport() {
		System.out.println("20 sms per day");
	}
	public void ai() {
		System.out.println("perflexcity ai free");
	}
}
