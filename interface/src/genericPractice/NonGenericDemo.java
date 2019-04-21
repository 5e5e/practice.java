package genericPractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NonGenericDemo {
	private static final Logger logger = LoggerFactory.getLogger(NonGenericDemo.class);
	static MyHolder myHolder = new MyHolder();

	static void produce() {
		//myHolder.set(6);
		myHolder.set("6");
	}

	static void consume() {
		logger.debug((Integer) myHolder.get() / 2 + "");
	}

	static class MyHolder {
		Object item;

		void set(Object obj) {
			item = obj;
		}

		Object get() {
			return item;
		}
	}
}
