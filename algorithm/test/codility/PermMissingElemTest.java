package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermMissingElemTest {
	private static final Logger logger = LoggerFactory.getLogger(PermMissingElemTest.class);
	private PermMissingElem permMissingElem;

	@Test
	public void testCase1() {
		assertEquals(4, permMissingElem.solution(new int[]{2, 3, 1, 5}));
	}

	@BeforeEach
	public void setup() {
		permMissingElem = new PermMissingElem();
	}

	private class PermMissingElem {
		public int solution(int[] A) {
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < A.length; i++) {
				set.add(i + 1);
			}
			for (int i = 0; i < A.length; i++) {
				if (set.contains(A[i])) set.remove(A[i]);
			}
			return set.iterator().next();
		}
	}
}
