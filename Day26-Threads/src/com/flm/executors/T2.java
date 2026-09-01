package com.flm.executors;

public class T2 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("t2 running...");
		}
	}
}
