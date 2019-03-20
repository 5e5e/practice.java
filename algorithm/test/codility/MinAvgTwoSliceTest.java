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
			int answer = 0;
			double avg = (A[0] + A[1]) / 2;
			for (int i = 2; i < A.length; i++) {
				double temp2 = (A[i - 2] + A[i - 1] + A[i]) / 3.0;
				if (temp2 < avg) {
					avg = temp2;
					answer = i - 2;
				}

				temp2 = (A[i - 1] + A[i]) / 2.0;
				if (temp2 < avg) {
					avg = temp2;
					answer = i - 1;
				}
			}
			return answer;
		}
	}
}
