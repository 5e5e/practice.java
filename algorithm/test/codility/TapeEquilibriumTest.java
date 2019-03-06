package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TapeEquilibriumTest {
	private static final Logger logger = LoggerFactory.getLogger(TapeEquilibriumTest.class);
	private TapeEquilibrium tapeEquilibrium;

	@BeforeEach
	public void setup() {
		tapeEquilibrium = new TapeEquilibrium();
	}

	@Test
	public void testCase1() {
		assertEquals(1, tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}));
	}

	private class TapeEquilibrium {
		// A = 배열 N = 배열의 길이 P =
		public int solution(int[] A) {
			int answer = 0;
			int result = 0;
			int N = A.length;
			int P = 1;
			for (; P < N; P++) {
				result = sum(firstPartCal(A, 0, P - 1), secondPartCal(A, P, N - 1));
				if (result <= answer || answer == 0) answer = result;
			}
			return answer;
		}

		private int sum(int firstValue, int secondValue) {
			return (firstValue - secondValue) < 0 ? -(firstValue - secondValue) : (firstValue - secondValue);
		}

		private int secondPartCal(int[] A, int start, int end) {
			int temp = 0;
			for (; start <= end; start++) {
				temp += A[start];
			}
			return temp;
		}

		private int firstPartCal(int[] A, int start, int end) {
			int temp = 0;
			for (; start <= end; start++) {
				temp += A[start];
			}
			return temp;
		}
	}
}
