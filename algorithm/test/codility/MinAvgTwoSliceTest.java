package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinAvgTwoSliceTest {
	private static final Logger logger = LoggerFactory.getLogger(MinAvgTwoSliceTest.class);
	private MinAvgTwoSlice minAvgTwoSlice;

	@BeforeEach
	void setup() {
		minAvgTwoSlice = new MinAvgTwoSlice();
	}

	@Test
	void testCase1() {
		assertEquals(1, minAvgTwoSlice.solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
	}

	private class MinAvgTwoSlice {
		public int solution(int[] A) {
			int answer = Integer.MAX_VALUE;
			for (int p = 0; p < A.length; p++) {
				int average = A[p];
				for (int q = p + 1; q < A.length; q++) {
					logger.debug("average : " + average);
					average = (average + A[q]) / 2;
					answer = Math.min(answer, average);
					logger.debug("answer : " + answer);
				}
			}
			return answer;
		}

		private int average(int p, int q, int average) {
			return average += ((p + q) / 2);
		}
	}
}
