package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TapeEquilibriumTest {
	private static final Logger logger = LoggerFactory.getLogger(TapeEquilibriumTest.class);
	private TapeEquilibrium tapeEquilibrium;

	@BeforeEach
	public void setup() {
		tapeEquilibrium = new TapeEquilibrium();
	}

	@Test
	public void testCase1() {
		assertEquals(1, tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}));
	}
	@Test
	public void testCase2() {
		assertEquals(1, tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}));
	}
	@Test
	public void testCase3() {
		assertEquals(1, tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}));
	}
	@Test
	public void testCase4() {
		assertEquals(1, tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}));
	}


	private class TapeEquilibrium {
		public int solution(int[] A) {
			int answer = 0;
			for (int i = 0; i < A.length; i++) {
				answer += A[i];
			}
			int temp = 0;
			int bounder = 0;

			int diff = Integer.MAX_VALUE;
			for (int P = 1; P < A.length; P++) {
				temp += A[P - 1];
				bounder = answer - temp;
				diff = Math.min(diff, Math.abs(bounder - temp));
			}
			return diff;
		}


	}
}
