package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaxCountersTest {
	private static final Logger logger = LoggerFactory.getLogger(MaxCountersTest.class);
	private MaxCounters maxCounters;

	@BeforeEach
	public void setup() {
		maxCounters = new MaxCounters();
	}

	@Test
	public void testCase1() {
		assertArrayEquals(new int[]{3, 2, 2, 4, 2}, maxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
	}

	private class MaxCounters {

		public int[] solution(int N, int[] A) {
			int[] answers = new int[N];
			int maxCounter = 0;
			int temp = 0;
			for (int i : A) {
				if (1 <= i && i <= N) {
					if (answers[i - 1] < maxCounter) answers[i - 1] = maxCounter + 1;
					else answers[i - 1] += 1;
					if (temp < answers[i - 1]) temp = answers[i - 1];
				} else
					maxCounter = temp;
			}

			for (int i = 0; i < answers.length; i++) {
				if (answers[i] < maxCounter) answers[i] = maxCounter;
			}
			return answers;
		}
	}
}