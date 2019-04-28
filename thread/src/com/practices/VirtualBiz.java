package com.practices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class VirtualBiz {
	private static final Logger logger = LoggerFactory.getLogger(VirtualBiz.class);
	private Random random = new Random();

	public Integer processA() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		int rNum = random.nextInt(10);
		logger.debug("rNum : " + rNum);
		return rNum;
	}

	public Integer processB() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		int rNum = random.nextInt(10);
		logger.debug("rNum : " + rNum);
		return rNum;
	}
}
