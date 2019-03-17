package beadal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class one {
	private static final Logger logger = LoggerFactory.getLogger(one.class);
	private One one;

	@BeforeEach
	void setup() {
		one = new One();
	}

	@Test
	void testCase1() {
		assertArrayEquals(new int[]{1, 0, 0, 0, 0, 2, 0, 3, 7}, one.solution(50237));
	}

	@Test
	void testCase2() {
		assertArrayEquals(new int[]{0, 1, 1, 0, 0, 0, 0, 0, 0}, one.solution(15000));
	}

	private class One {
		public int[] solution(int money) {
			int[] answer = new int[9];
			while (money != 0) {
				if (money >= 50000) {
					answer[0] = money / 50000;
					money = money % 50000;
				} else if (money >= 10000) {
					answer[1] = money / 10000;
					money = money % 10000;
				} else if (money >= 5000) {
					answer[2] = money / 5000;
					money = money % 5000;
				} else if (money >= 1000) {
					answer[3] = money / 1000;
					money = money % 1000;
				} else if (money >= 500) {
					answer[4] = money / 500;
					money = money % 500;
				} else if (money >= 100) {
					answer[5] = money / 100;
					money = money % 100;
				} else if (money >= 50) {
					answer[6] = money / 50;
					money = money % 50;
				} else if (money >= 10) {
					answer[7] = money / 10;
					money = money % 10;
				} else {
					answer[8] = money / 1;
					money = money % 1;
				}
			}
			return answer;
		}
	}
}
