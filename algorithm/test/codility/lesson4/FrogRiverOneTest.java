package codility.lesson4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrogRiverOneTest {
	private static final Logger logger = LoggerFactory.getLogger(FrogRiverOneTest.class);
	private FrogRiverOne frogRiverOne;

	@BeforeEach
	public void setup() {
		frogRiverOne = new FrogRiverOne();
	}

	@Test
	public void testCase1() {
		assertEquals(4, frogRiverOne.solution(5, new int[]{1, 2, 3, 4, 5, 3, 5, 4}));
	}

	@Test
	public void testCase2() {
		assertEquals(-1, frogRiverOne.solution(10, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
	}

	@Test
	void testCase3() {
		assertEquals(7, frogRiverOne.solution(4, new int[]{1, 4, 1, 2, 2, 3, 5, 4}));
	}

	@Test
	void testCase4() {
		assertEquals(4, frogRiverOne.solution(3, new int[]{1, 3, 1, 3, 2, 1, 3}));
	}

	private class FrogRiverOne {
		public int solution(int X, int[] A) {
			Set set = new HashSet();
			for (int i = 1; i <= X; i++) {
				set.add(i);
			}
			for (int i = 0; i < A.length; i++) {
				if (A[i] <= X) set.remove(A[i]);
				if (set.isEmpty()) return i;
			}
			return -1;
		}
	}
}
