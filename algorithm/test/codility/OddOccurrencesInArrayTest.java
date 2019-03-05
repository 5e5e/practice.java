package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddOccurrencesInArrayTest {
	private static final Logger logger = LoggerFactory.getLogger(OddOccurrencesInArrayTest.class);
	private OddOccurrencesInArray oddOccurrencesInArray;

	@BeforeEach
	public void setup() {
		oddOccurrencesInArray = new OddOccurrencesInArray();
	}

	@Test
	public void testCase1() {
		int[] testData = {9, 3, 9, 3, 9, 7, 9};
		assertEquals(7, oddOccurrencesInArray.solution(testData));
	}

	@Test
	public void testCase2() {
		int[] testData = {2, 2, 3, 3, 4};
		assertEquals(4, oddOccurrencesInArray.solution(testData));
	}

	private class OddOccurrencesInArray {

		public int solution(int[] A) {
			Set<Integer> set = new HashSet<>();
			for (int n = 0; n < A.length; n++) {
				if (set.contains(A[n])) set.remove(A[n]);
				else set.add(A[n]);
			}

			return set.iterator().next();
		}
	}
}
