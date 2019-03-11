package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

	private class PassingCars {
		public int solution(int[] A) {

			int answer = 0;
			int zero = 0;

			for (int i = 0; i < A.length; i++) {
				if (A[i] == 0) zero += 1;
				else answer += zero;
			}

			if (answer > 1000000000 || answer < 0) return -1;
			return answer;
		}
	}
}
