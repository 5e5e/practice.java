package com.practices;

public class Incrementer {
	private int data = 0;

	public void increment() {
		synchronized (this) {
			for (int i = 0; i < 1000000; i++) {
				data += 1;
			}
		}
	}

	public int getData() {
		return data;
	}
}
