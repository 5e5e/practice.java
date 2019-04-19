package codility.lesson6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfDiscIntersectionsTest {
	private static final Logger logger = LoggerFactory.getLogger(NumberOfDiscIntersectionsTest.class);
	private NumberOfDiscIntersections numberOfDiscIntersections;

	@BeforeEach
	void setUp() {
		numberOfDiscIntersections = new NumberOfDiscIntersections();
	}

	@Test
	void testCase1() {
		assertEquals(11, numberOfDiscIntersections.solution(new int[]{1, 5, 2, 1, 4, 0}));
	}

	private class NumberOfDiscIntersections {
		public int solution(int[] A) {
			int answer = 0;
			if (answer > 100000000) return -1;
			return answer;
		}
	}
}
