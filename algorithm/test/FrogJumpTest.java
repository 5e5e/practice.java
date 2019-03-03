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

	private class FromJump {
		public int solution(int X, int Y, int D) {
			int answer = 0;
			while (X < Y) {
				X += D;
				answer += 1;
			}
			return answer;
		}
	}
}
