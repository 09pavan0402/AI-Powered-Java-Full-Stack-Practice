package com.flm.waitmethod;

public class T1 extends Thread{
	Object obj;
	public T1(Object obj) {
		this.obj=obj;
	}
	@Override
	public void run() {
		synchronized (obj) {
			System.out.println("T1 started...");
			System.out.println("T1 entering waiting state...");
			try {
				obj.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("T1 resumed");
		}
	}
}
