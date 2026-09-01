package com.flm.waitmethod;

public class T2 extends Thread{
	Object obj;
	public T2(Object obj) {
		this.obj=obj;
	}
	@Override
	public void run() {
		synchronized (obj) {
			System.out.println("T2 started...");
//			System.out.println("T2 notifing T1");
			System.out.println("T2 notifing all threads");
//			obj.notify();
			obj.notifyAll();
		}
	}
}
