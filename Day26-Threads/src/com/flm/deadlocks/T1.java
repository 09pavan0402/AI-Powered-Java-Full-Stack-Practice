package com.flm.deadlocks;

public class T1 extends Thread{
	T2 t2;
	
	@Override
	public void run() {
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("t1..");
	}
}
