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
			for(int i=0; i<A.length; i++) {
				if (A[i] >= 1 && A[i] <= N) {
					// increase X(A[i]) = answert[X] +1;
					answers[A[i] - 1] += 1;
					if (maxCounter < answers[A[i] - 1]) {
						maxCounter = answers[A[i] - 1];

					}
				} else if (A[i] == N + 1) {
					for (int j = 0; j < answers.length; j++) {
						answers[j] = maxCounter;
					}
				}
			}

			return answers;
		}
	}
}
