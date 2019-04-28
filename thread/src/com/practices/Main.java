package com.practices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Random;

public class Main {
	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	private Random mRandom = new Random();

	public static void main(String[] args) {
		Runnable runnable = () -> {
			new Main().firstMethod();
		};

		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);

		thread1.start();
		thread2.start();
	}

	private void firstMethod() {
		int rNum = mRandom.nextInt(10);
		repeat(rNum);
		secondMethod();

		List<Integer> intList = ThreadLocalUtil.getIntList();
		logger.debug(Thread.currentThread().getName() + " " + intList.toString());
		List<String> strList = ThreadLocalUtil.getStrList();
		logger.debug(Thread.currentThread().getName() + " " + strList.toString());
	}

	private void repeat(int rNum) {
		logger.debug(Thread.currentThread().getName() + " " + rNum);
		ThreadLocalUtil.addInt(rNum);
		ThreadLocalUtil.addStr(rNum + "Str");
	}

	private void secondMethod() {
		int rNum = mRandom.nextInt(10);
		repeat(rNum);
		thirdMethod();
	}

	private void thirdMethod() {
		int rNum = mRandom.nextInt(10);
		repeat(rNum);
	}
}
