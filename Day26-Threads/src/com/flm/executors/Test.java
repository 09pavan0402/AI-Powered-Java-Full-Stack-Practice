package com.flm.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	public static void main(String[] args) {
		T1 t1=new T1();
		T2 t2=new T2();
		ExecutorService executorservices=Executors.newFixedThreadPool(1);
		executorservices.execute(t1);
		executorservices.execute(t2);
	}
}
