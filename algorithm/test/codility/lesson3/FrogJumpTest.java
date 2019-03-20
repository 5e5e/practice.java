package codility.lesson3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrogJumpTest {
	private static final Logger logger = LoggerFactory.getLogger(FrogJumpTest.class);
	private FromJump fromJump;

	@BeforeEach
	public void setup() {
		fromJump = new FromJump();
	}

	@Test
	public void testCase1() {
		assertEquals(3, fromJump.solution(10, 85, 30));
	}

	@Test
	public void testCase2() {
		assertEquals(0, fromJump.solution(10, 10, 10));

	}

	@Test
	public void testCase3() {
		assertEquals(142730189, fromJump.solution(3, 999111321, 7));

	}

	@Test
	public void testCase4() {
		assertEquals(2, fromJump.solution(1, 5, 2));

	}

	private class FromJump {
		public int solution(int X, int Y, int D) {
			int 몫 = (Y - X) / D;
			int 나머지 = (Y - X) % D;
			if (나머지 == 0) {
				return 몫;
			}
			return 몫 + 1;
		}
	}
}
