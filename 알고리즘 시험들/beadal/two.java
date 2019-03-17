package beadal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class two {
	private static final Logger logger = LoggerFactory.getLogger(two.class);
	private Two two;

	@BeforeEach
	void setup() {
		two = new Two();
	}

	@Test
	void testCase1() {
		assertTrue(two.solution(new int[][]{{10, 0, 30, 5}, {0, 30, 20, 50}, {30, 30, 40, 40}}, new int[][]{{15, 15, 25, 25}, {40, 10, 50, 20}}, new int[]{10, 10, 30, 30}));
	}

	@Test
	void testCase2() {
		assertFalse(two.solution(new int[][]{{10, 0, 30, 5}, {0, 30, 20, 50}, {30, 30, 40, 40}}, new int[][]{{15, 15, 25, 25}, {40, 10, 50, 20}}, new int[]{10, 10, 30, 30}));
	}

	private class Two {
		public boolean solution(int[][] lands, int[][] wells, int[] point) {
			boolean answer = true;
			return answer;
		}
	}
}
