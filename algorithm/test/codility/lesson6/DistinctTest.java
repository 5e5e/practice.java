package codility.lesson6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistinctTest {
	private static final Logger logger = LoggerFactory.getLogger(DistinctTest.class);
	private Distinct distinct;

	@BeforeEach
	void setUp() {
		distinct = new Distinct();
	}

	@Test
	void testCase1() {
		assertEquals(3, distinct.solution(new int[]{2, 1, 1, 2, 3, 1}));
	}

	private class Distinct {
		public int solution(int[] A) {
			Set<Integer> set = new HashSet<>();
			for (int i : A) {
				set.add(i);
			}
			return set.size();
		}
	}
}
