package com.flm.threadmethods;

public class Counter {
	int count =0;
//	public void increment() {
//		this.count++;
//	}
//	public synchronized void increment() {
//		this.count++;
//	}
	public void increment() {
		synchronized (this) {
			this.count++;
		}
	}
	
}
