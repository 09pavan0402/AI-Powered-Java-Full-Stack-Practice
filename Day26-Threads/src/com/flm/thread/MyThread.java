package com.flm.thread;

public class MyThread extends Thread{
	@Override
	public void run() {
		Thread.currentThread().setName("pavan thread");
		System.out.println(Thread.currentThread().getName());
//		System.out.println("hii......");
		for(int i=1;i<=15;i++) {
			System.out.println("hii");
		}
	}
}
