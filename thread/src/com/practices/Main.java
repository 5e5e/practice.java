package com.practices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args)  {
		// write your code here
		ExecutorService executor = Executors.newFixedThreadPool(5);
		final BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(100);
		final Random random = new Random();

		for (int i = 0; i < 100; i++) {
			try {
				queue.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		Runnable worker = () -> {
			Integer intNum = null;
			try {
				intNum = queue.take();
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			logger.debug("intNum : " + intNum.toString());
		};

		for (int i = 0; i < 100; i++) {
			executor.execute(worker);
		}

		executor.shutdown();
		while(!executor.isShutdown()) {

		}
	}
}
