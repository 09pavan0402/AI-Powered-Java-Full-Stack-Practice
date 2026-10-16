package com.flm.thread;

public class Test {

	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getName());
//		MyThread t1=new MyThread();
//		t1.start();
//		t1.run();
//		System.out.println("bye...");
		MyThread t1=new MyThread();
		t1.start();
		for(int i=1;i<=20;i++) {
			System.out.println("bye");
		}
	}
}
