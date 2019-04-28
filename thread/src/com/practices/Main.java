package com.practices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.*;

public class Main {
	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Callable<Integer> callableA = () -> {
			return new VirtualBiz().processA();
		};
		Callable<Integer> callableB = () -> {
			return new VirtualBiz().processB();
		};

		Future<Integer> futureA = executor.submit(callableA);
		Future<Integer> futureB = executor.submit(callableB);

		Integer sum = null;

		try {
			Integer a = futureA.get();
			Integer b = futureB.get();
			sum = a + b;
		} catch (InterruptedException | ExecutionException e) {
			throw new RuntimeException(e);
		}

		logger.debug("sum : " + sum);
		long duration = System.currentTimeMillis() - start;
		logger.debug("duration : " + duration);
	}

}
