package com.flm.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Integer> cal=new Calculator();
		ExecutorService executorService =Executors.newFixedThreadPool(2);
		Future<Integer> future=executorService.submit(cal);
		Integer num=future.get();
		System.out.println(num);
		System.out.println(num/2);
		executorService.shutdown();
	}
}
