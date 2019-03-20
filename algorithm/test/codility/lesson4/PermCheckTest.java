package codility.lesson4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermCheckTest {
	private static final Logger logger = LoggerFactory.getLogger(PermCheckTest.class);
	private PermCheck permCheck;

	@BeforeEach
	public void setup() {
		permCheck = new PermCheck();
	}

	@Test
	public void testCase1() {
		assertEquals(1, permCheck.solution(new int[]{4, 1, 3, 2}));
	}

	@Test
	public void testCase2() {
		assertEquals(0, permCheck.solution(new int[]{4, 1, 3}));
	}

	@Test
	public void testCase3() {
		assertEquals(0, permCheck.solution(new int[]{9}));
	}

	@Test
	public void testCase4() {
		assertEquals(0, permCheck.solution(new int[]{1, 3}));
	}

	private class PermCheck {
		public int solution(int[] A) {
			Set<Integer> integerSet = new HashSet<>();
			for (int i = 1; i <= A.length; i++) integerSet.add(i);
			for (int i : A) if (integerSet.contains(i)) integerSet.remove(i);

			return integerSet.isEmpty() ? 1 : 0;
		}
	}
}
