package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountDivTest {
	// 합동식
	private static final Logger logger = LoggerFactory.getLogger(CountDivTest.class);
	private CountDiv countDiv;

	@BeforeEach
	void setUp() {
		countDiv = new CountDiv();
	}

	@Test
	void testCase1() {
		assertEquals(3, countDiv.solution(6, 11, 2));
	}

	@Test
	void testCase2() {
		assertEquals(1, countDiv.solution(0, 0, 11));
	}

	@Test
	void testCase3() {
		assertEquals(1, countDiv.solution(0, 1, 17));
	}

	private class CountDiv {
		public int solution(int A, int B, int K) {
			if (A == 0) {
				return B / K + 1;
			}
			return (B / K + 1) - ((A - 1) / K + 1);
		}
	}
}
