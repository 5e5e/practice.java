package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassingCarsTest {
	private static final Logger logger = LoggerFactory.getLogger(PassingCarsTest.class);
	private PassingCars passingCars;

	@BeforeEach
	void setUp() {
		passingCars = new PassingCars();
	}

	@Test
	void testCase1() {
		assertEquals(5, passingCars.solution(new int[]{0, 1, 0, 1, 1}));
	}

	@Test
	void testCase2() {
		assertEquals(-1, passingCars.solution(new int[]{}));
	}

	private class PassingCars {
		public int solution(int[] A) {
			if (A.length == 0) {
				return -1;
			}
			int answer = 0;

			List<Integer> P = new ArrayList();
			List<Integer> Q = new ArrayList();
			for (int i = 0; i < A.length; i++) {
				if (A[i] == 0)
					P.add(i);
				else
					Q.add(i);
			}
			for (Integer q : Q) {
				for (Integer p : P) {
					if ((q - p) > 0) answer += 1;
				}
			}
			return answer;
		}
	}
}
