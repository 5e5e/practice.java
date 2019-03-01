import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryGapTest {
	private static final Logger logger = LoggerFactory.getLogger(BinaryGapTest.class);
	private BinaryGap binaryGap;

	@BeforeEach
	public void setup() {
		binaryGap = new BinaryGap();
	}

	@Test
	// number 9 has binary representation 1001 and contains a binary gap of length 2.
	public void testCase1() {
		assertEquals(2, binaryGap.solution(9));
	}

	@Test
	// The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
	public void testCase2() {
		assertEquals(4, binaryGap.solution(529));
	}

	@Test
	// The number 20 has binary representation 10100 and contains one binary gap of length 1.
	public void testCase3() {
		assertEquals(1, binaryGap.solution(20));
	}

	@Test
	// The number 15 has binary representation 1111 and has no binary gaps.
	public void testCase4() {
		assertEquals(0, binaryGap.solution(15));
	}

	@Test
	// The number 32 has binary representation 100000 and has no binary gaps.
	public void testCase5() {
		assertEquals(0, binaryGap.solution(32));
	}

	@Test
	// given N = 1041 the function should return 5.
	public void testCase6() {
		assertEquals(5, binaryGap.solution(1041));
	}

	private class BinaryGap {

		public int solution(int N) {
			int answer = 0;
			boolean[] test = new boolean[N / 2];
			for (int i = 0; N > 0; i++) {
				if (N % 2 == 0) {
					test[i] = true;
				} else {
					test[i] = false;
				}
				N = N / 2;
			}
			int zeroCount = 0;
			int bouder = 0;
			for (boolean index : test) {
				if (index == false) {
					bouder += 1;
					if (zeroCount >= answer) {
						answer = zeroCount;
						zeroCount = 0;
					}
				} else if (bouder >= 1 && index == true)
					zeroCount += 1;
			}
			return answer;
		}
	}

}
