package codility.lesson7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FishTest {
	private static final Logger logger = LoggerFactory.getLogger(FishTest.class);
	private Fish fish;

	@Test
	void testCase1() {
		assertEquals(2, fish.solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}));
	}

	@BeforeEach
	void setUp() {
		fish = new Fish();
	}

	private class Fish {
		public int solution(int[] A, int[] B) {
			Stack<Integer> fish = new Stack<>();
			Stack<Integer> direction = new Stack<>();
			for (int i : A) fish.push(i);
			for (int i : B) direction.push(i);
			fish.peek();
			for (int Q = 1; Q < A.length; Q++) {
				int P = Q - 1;
				if ((B[P] == 1) && (B[Q] == 1)) {
					int realP = P;
				}
			}
			return 0;
		}
	}
}
