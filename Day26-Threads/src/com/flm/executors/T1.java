package com.flm.executors;

public class T1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("t1 running...");
		}
	}
}
