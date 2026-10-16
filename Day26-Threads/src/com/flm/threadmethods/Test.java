package com.flm.threadmethods;

public class Test {

	public static void main(String[] args) {
		Counter counter = new Counter();
		Thread1 thread1=new Thread1(counter);
		Thread2 thread2=new Thread2(counter);
		thread1.start();
		thread2.start();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Counter value: "+ counter.count);
	}
}
