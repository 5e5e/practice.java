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
		int[] A = new int[]{3, 1, 2, 5, 4};
		quickSort(A, 0, 4);
		for (int i : A) {
			logger.debug(i + "");
		}
		assertEquals(1, tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}));
	}

	private void quickSort(int[] A, int low, int high) {
		if (low < high) {
			int p = partition(A, low, high);
			logger.debug("p : " + p);
			quickSort(A, low, p);
			quickSort(A, p + 1, high);
		}
	}

	private int partition(int[] a, int low, int high) {
		int pivot = a[(low + high) / 2];
		int i = low - 1;
		int j = high + 1;
		while (true) {
			logger.debug("pivot : " + pivot);
			i += 1;
			while (a[i] < pivot) i += 1;
			logger.debug("a[i] : " + a[i]);
			j -= 1;
			while ( a[j] > pivot) j -= 1;
			logger.debug("a[j] : " + a[j]);
			if (i >= j) return j;
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}

	private class TapeEquilibrium {
		// A = 배열 N = 배열의 길이 P = 0< p<N
		public int solution(int[] A) {
			int answer = quickSum(A, 0, A.length-1);
			int count = 0;
			int N = A.length;
			int P = 1;
			while (P < N) {
				int leftResult = 0;
				int rightResult = 0;
				int finalResult = 0;
				for (int i = 0; i <= P - 1; i++) {
					leftResult += A[i];
				}
				for (int i = P; i < N; i++) {
					rightResult += A[i];
				}
				finalResult = absolute(leftResult, -rightResult);
				if (count == 0 || answer >= finalResult) {
					answer = finalResult;
				}
				count += 1;
				P += 1;
			}
			return answer;
		}

		private int quickSum(int[] a, int low, int high) {
			int p = 0;
			if (low < high) {
				
			}
			return p =;
		}

		private int absolute(int leftResult, int rightResult) {
			return (leftResult + rightResult) < 0 ? -(leftResult + rightResult) : (leftResult + rightResult);
		}
	}
}
