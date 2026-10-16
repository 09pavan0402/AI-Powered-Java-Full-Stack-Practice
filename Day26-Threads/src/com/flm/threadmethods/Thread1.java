package com.flm.threadmethods;

public class Thread1 extends Thread{
	Counter counter;
	public Thread1(Counter counter){
		this.counter=counter;
	}
	public Thread1() {
		
	}
	@Override
	public void run() {
		for(int i=1;i<=20000;i++) {
			System.out.println("T1- "+i);
			counter.increment();
		}
	}
}
