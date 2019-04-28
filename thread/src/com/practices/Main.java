package com.practices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		// write your code here
		Incrementer incrementer = new Incrementer();
		Thread thread1 = new Thread(() -> {
			incrementer.increment();
		});

		Thread thread2 = new Thread(() -> {
			incrementer.increment();
		});

		thread1.start();
		thread2.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		logger.debug("result :" + incrementer.getData());
	}
}
