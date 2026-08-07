package com.flm.traiinterfaces;

public class Test {

	public static void main(String[] args) {
		TataDocomo td=new TataDocomo();
		td.callingSupport();
		td.networkSupport();
		td.smsSupport();
		System.out.println("================");
		Airtel airtel=new Airtel();
		airtel.callingSupport();
		airtel.networkSupport();
		airtel.smsSupport();
		System.out.println("================");
		Jio jio=new Jio();
		jio.callingSupport();
		jio.networkSupport();
		jio.smsSupport();
		jio.romming();
		jio.ott();
	}
}
