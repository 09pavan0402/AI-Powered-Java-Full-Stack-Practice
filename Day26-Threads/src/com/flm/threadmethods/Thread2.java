package com.flm.threadmethods;

public class Thread2 extends Thread{
	Counter counter;
	public Thread2(Counter counter){
		this.counter=counter;
	}
	public Thread2() {
		
	}
	@Override
	public void run() {
		for(int i=1;i<=20000;i++) {
			System.out.println("T2- "+i);
			counter.increment();
		}
	}
}
