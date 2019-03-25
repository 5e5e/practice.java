package codility.lesson6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
	private static final Logger logger = LoggerFactory.getLogger(TriangleTest.class);
	private Triangle triangle;

	@BeforeEach
	void setUp() {
		triangle = new Triangle();
	}

	@Test
	void testCase1() {
		assertEquals(1, triangle.solution(new int[]{10, 2, 5, 1, 4, 8, 20}));
	}

	@Test
	void testCase2() {
		assertEquals(0, triangle.solution(new int[]{10, 50, 5, 1}));
	}

	private class Triangle {
		public int solution(int[] A) {
			quickSort(A, 0, A.length - 1);
			for (int i = 2; i < A.length; i++) {
				if ((long) A[i] < (long) A[i - 1] + (long) A[i - 2]) return 1;
			}
			return 0;
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
				if (i >= j) return j;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
	}
}
