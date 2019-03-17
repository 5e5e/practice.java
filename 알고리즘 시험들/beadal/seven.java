package beadal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class seven {
	private static final Logger logger = LoggerFactory.getLogger(seven.class);
	private Seven seven;

	@BeforeEach
	void setup() {
		seven = new Seven();
	}

	@Test
	void testCase1() {
		assertEquals("brown", seven.solution("browoanoommnaon"));
	}

	@Test
	void testCase2() {
		assertEquals("", seven.solution("zyelleyz"));
	}

	private class Seven {
		public String solution(String cryptogram) {
			StringBuilder stringBuilder = new StringBuilder(cryptogram);
			boolean flag = true;
			while (flag) {
				char[] chars = stringBuilder.toString().toCharArray();
				stringBuilder.setLength(0);
				int count = Integer.MAX_VALUE;
				for (int i = 0; i < chars.length - 1; ) {
					if (chars[i] == chars[i + 1]) {
						count--;
						i += 2;
					} else {
						stringBuilder.append(chars[i]);
						i += 1;
					}
				}

				stringBuilder.append(chars[chars.length - 1]);
				if (count == Integer.MAX_VALUE) flag = false;
				else
					flag = true;
			}
			return stringBuilder.toString();
		}
	}
}
