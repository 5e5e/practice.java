package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingIntegerTest {
	private static final Logger logger = LoggerFactory.getLogger(MissingIntegerTest.class);
	private MissingInteger missingInteger;

	@BeforeEach
	public void setup() {
		missingInteger = new MissingInteger();
	}

	@Test
	public void testCase1() {
		assertEquals(5, missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2}));
	}

	@Test
	public void testCase2() {
		assertEquals(4, missingInteger.solution(new int[]{1, 2, 3}));
	}

	@Test
	public void testCase3() {
		assertEquals(1, missingInteger.solution(new int[]{-1, -3}));
	}

	private class MissingInteger {

		public int solution(int[] A) {
			// 0<A[i] <= A.length
			int answer = 0;
			Set<Integer> integerSet = new HashSet<>();
			for (int i = 1; i <= A.length; i++) {
				integerSet.add(i);
			}
			for (int i : A) {
				if (integerSet.contains(i)) integerSet.remove(i);
			}

			if (integerSet.isEmpty()) {
				return A.length + 1;
			}
			answer = integerSet.iterator().next();
			return answer < 0 ? 1 : answer;
		}
	}
}
