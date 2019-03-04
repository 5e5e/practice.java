package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CyclicRotationTest {
	private static final Logger logger = LoggerFactory.getLogger(CyclicRotationTest.class);
	private CyclicRotation cyclicRotation;

	@BeforeEach
	public void setup() {
		cyclicRotation = new CyclicRotation();
	}

	@Test
	public void testCase1() {
		int[] input = {3, 8, 9, 7, 6};
		int[] answer = {9, 7, 6, 3, 8};
		assertArrayEquals(answer, cyclicRotation.solution(input, 3));
	}

	@Test
	public void testCase2() {
		assertArrayEquals(new int[]{0, 0, 0}, cyclicRotation.solution(new int[]{0, 0, 0}, 1));
	}

	@Test
	public void testCase3() {
		assertArrayEquals(new int[]{1, 2, 3, 4}, cyclicRotation.solution(new int[]{1, 2, 3, 4}, 4));
	}

	@Test
	public void testCase4() {
		assertArrayEquals(new int[]{1, 2, 3, 4}, cyclicRotation.solution(new int[]{1, 2, 3, 4}, 40));
	}

	@Test
	public void testCase5() {
		assertArrayEquals(new int[]{}, cyclicRotation.solution(new int[]{}, 5));
	}

	private class CyclicRotation {
		public int[] solution(int[] A, int K) {
			if (A.length == 0) return new int[]{};
			if (K % A.length == 0) {
				return A;
			}


			K = K % A.length;
			LinkedList<Integer> first = new LinkedList<>();
			for (int i = 0; i < A.length; i++) {
				first.add(A[i]);
			}

			LinkedList<Integer> second = new LinkedList<>();
			for (int i = 0; i < K; i++) {
				for (int j = 0; j < A.length; j++) {
					if (j == 0) {
						second.add(first.pollLast());
					} else second.add(first.poll());

				}
				first = second;
			}
			for (int i = 0; i < A.length; i++) {
				A[i] = first.poll();
			}
			return A;
		}
	}
}
