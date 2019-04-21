import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		IMyHolder<String> myHolder1 = new MyHolder1<String>();
		IMyHolder<String> myHolder2 = new MyHolder2<String, Integer>();
		IMyHolder<String> myHolder3 = new MyHolder3();
		IMyHolder<String> myHolder4 = new MyHolder4<String>();
	}

	static interface IMyHolder<T> {
		void set(T item);

		T get();
	}

	static class MyHolder1<T> implements IMyHolder<T> {
		T item;

		@Override
		public void set(T item) {
			this.item = item;
		}

		@Override
		public T get() {
			return item;
		}
	}

	static class MyHolder2<T, E> implements IMyHolder<T> {
		T item;

		@Override
		public void set(T item) {
			this.item = item;
		}

		@Override
		public T get() {
			return item;
		}

		public void print(E item) {
			logger.debug("" + item);
		}
	}

	static class MyHolder3 implements IMyHolder<String> {
		String item;

		@Override
		public void set(String item) {
			this.item = item;
		}

		@Override
		public String get() {
			return item;
		}
	}

	static class MyHolder4<T> implements IMyHolder<String> {
		String item;

		@Override
		public void set(String item) {
			this.item = item;
		}

		@Override
		public String get() {
			return item;
		}

		public void print(T item) {
			logger.debug("" + item);
		}
	}

}
