package codility.lesson6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxProductOfThreeTest {
	private static final Logger logger = LoggerFactory.getLogger(MaxProductOfThreeTest.class);
	private MaxProductOfThree maxProductOfThree;

	@Test
	void testCase1() {
		assertEquals(60, maxProductOfThree.solution(new int[]{-3, 1, 2, -2, 5, 6}));
	}

	@BeforeEach
	void setUp() {
		maxProductOfThree = new MaxProductOfThree();
	}

	private class MaxProductOfThree {
		public int solution(int[] A) {
			quickSort(A, 0, A.length - 1);
			int index = A.length - 1;
			return A[index] * A[index - 1] * A[index - 2];
		}

		private void quickSort(int[] A, int low, int high) {
			if (low < high) {
				int p = partition(A, low, high);
				quickSort(A, low, p);
				quickSort(A, p + 1, high);
			}
		}

		private int partition(int[] A, int low, int high) {
			int pivot = A[(low + high) / 2];
			int i = low - 1;
			int j = high + 1;
			while (true) {
				do {
					i += 1;
				} while (A[i] < pivot);
				do {
					j -= 1;
				} while (A[j] > pivot);
				if (i >= j) {
					return j;
				}
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
	}
}
