import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	static MyHolder myHolder = new MyHolder();

	static void produce() {
		myHolder.set(6);
		// ClassCastException
//		myHolder.set("6");
	}

	static void consume() {
		logger.debug((Integer) myHolder.get() / 2 + "");
	}

	public static void main(String[] args) {
		produce();
		consume();
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
