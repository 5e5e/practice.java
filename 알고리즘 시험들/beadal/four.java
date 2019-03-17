package beadal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class four {
	private static final Logger logger = LoggerFactory.getLogger(four.class);
	private Four four;

	@BeforeEach
	void setup() {
		four = new Four();
	}

	@Test
	void testCase1() {
		assertEquals(0, four.solution(new int[]{97, 98}, new int[]{197, 198}));
	}

	@Test
	void testCase2() {
		assertEquals(1, four.solution(new int[]{131, 132}, new int[]{211, 212}));
	}

	@Test
	void testCase3() {
		assertEquals(-1, four.solution(new int[]{99, 102}, new int[]{211, 212}));
	}

	private class Four {
		public int solution(int[] pobi, int[] crong) {
			int pobiValue = result(pobi);
			int crongValue = result(crong);
			logger.debug("pobi : " + pobiValue);
			logger.debug("crong : " + crongValue);
			if (pobiValue == -1 || crongValue == -1) return -1;
			else if (pobiValue == crongValue) return 0;
			else
				return pobiValue > crongValue ? 1 : 2;
		}

		private int result(int[] player) {
			if (player[1] - player[0] != 1) return -1;
			return Math.max(sum(player[0], player[1]), multiple(player[0], player[1]));
		}

		private int multiple(int a, int b) {
			int aResult = 1;
			int bResult = 1;
			while (a != 0) {
				if (a >= 100) {
					aResult *= a / 100;
					a = a % 100;
				} else if (a >= 10) {
					aResult *= a / 10;
					a = a % 10;
				} else {
					aResult *= a / 1;
					a = a % 1;
				}
			}
			while (b != 0) {
				if (b >= 100) {
					bResult *= b / 100;
					b = b % 100;
				} else if (b >= 10) {
					bResult *= b / 10;
					b = b % 10;
				} else {
					bResult *= b / 1;
					b = b % 1;
				}
			}
			logger.debug("multiple aResult : " + aResult);
			logger.debug("multiple bResult : " + bResult);
			return Math.max(aResult, bResult);
		}

		private int sum(int a, int b) {
			int aResult = 0;
			int bResult = 0;
			while (a != 0) {
				if (a >= 100) {
					aResult += a / 100;
					a = a % 100;
				} else if (a >= 10) {
					aResult += a / 10;
					a = a % 10;
				} else {
					aResult += a / 1;
					a = a % 1;
				}
			}
			while (b != 0) {
				if (b >= 100) {
					bResult += b / 100;
					b = b % 100;
				} else if (b >= 10) {
					bResult += b / 10;
					b = b % 10;
				} else {
					bResult += b / 1;
					b = b % 1;
				}
			}
			logger.debug("sum aResult : " + aResult);
			logger.debug("sum bResult : " + bResult);
			return Math.max(aResult, bResult);
		}
	}
}
