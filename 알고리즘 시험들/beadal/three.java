package beadal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class three {
	private static final Logger logger = LoggerFactory.getLogger(three.class);
	private Three three;

	@BeforeEach
	void setup() {
		three = new Three();
	}

	@Test
	void testCase1() {
		assertEquals("R olev blf", three.solution("I love you"));
	}

	private class Three {

		public String solution(String word) {
			char[] chars = word.toCharArray();
			StringBuilder stringBuilder = new StringBuilder();
			for (char i : chars) {
				if (Character.isUpperCase(i)) {
					i = (char) (155 - i);
					stringBuilder.append(i);
				} else if (Character.isLowerCase(i)) {
					i = (char) (219 - i);
					stringBuilder.append(i);
				} else stringBuilder.append(i);
			}
			return stringBuilder.toString();
		}
	}
}
