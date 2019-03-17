package beadal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class five {
	private static final Logger logger = LoggerFactory.getLogger(five.class);
	private Five five;

	@BeforeEach
	void setup() {
		five = new Five();
	}

	@Test
	void testCase1() {
		assertEquals(4, five.solution(13));
	}

	@Test
	void testCase2() {
		assertEquals(14, five.solution(33));
	}

	private class Five {
		public int solution(int number) {
			int answer = 0;
			for (int i = 1; i <= number; i++) {
				answer += getAnswer(i);
			}
			return answer;
		}

		private int getAnswer(int i) {
			if (1 <= i && i <= 9) {
				return 일의자리(i);
			} else if (10 <= i && i <= 99) {
				return 십의자리(i);
			} else if (100 <= i && i <= 999) {
				return 백의자리(i);
			} else if (1000 <= i && i <= 9999)
				return 천의자리(i);
			else return 0;
		}

		private int 천의자리(int i) {
			int 몫 = i / 1000;
			int 나머지 = i % 1000;
			return 일의자리(몫) + 백의자리(나머지);
		}

		private int 백의자리(int i) {
			int 몫 = i / 100;
			int 나머지 = i % 100;
			return 일의자리(몫) + 십의자리(나머지);
		}

		private int 십의자리(int i) {
			int 몫 = i / 10;
			int 나머지 = i % 10;
			return 일의자리(몫) + 일의자리(나머지);
		}

		private int 일의자리(int i) {
			if (i == 3 || i == 6 || i == 9) {
				return 1;
			}
			return 0;
		}
	}
}
