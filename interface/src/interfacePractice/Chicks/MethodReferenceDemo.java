package interfacePractice.Chicks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MethodReferenceDemo {
	private static final Logger logger = LoggerFactory.getLogger(MethodReferenceDemo.class);

	public static void staticMethod() {
		logger.debug("staticMethod");
	}

	public void instanceMethod() {
		logger.debug("instanceMethod");
	}

	public void instanceMethod(String str) {
		logger.debug("instanceMethod " + str);
	}
}
