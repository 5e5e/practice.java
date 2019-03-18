package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMarathon {
	private static final Logger logger = LoggerFactory.getLogger(TestMarathon.class);
	private Marathon marathon;

	@BeforeEach
	void setup() {
		marathon = new Marathon();
	}

	@Test
	void testCase1() {
		assertEquals("leo", marathon.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
	}

	@Test
	void testCase2() {
		assertEquals("mislav", marathon.solution(new String[]{"mislav", "stanko", "mislav", "ana"},
				new String[]{"stanko", "ana", "mislav"}));
	}

	@Test
	void testCase3() {
		assertEquals("vinko", marathon.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
				new String[]{"josipa", "filipa", "marina", "nikola"}));
	}

	private class Marathon {
		public String solution(String[] participant, String[] completion) {
			// 첫번째
			Arrays.sort(participant);
			Arrays.sort(completion);
			for (int i = 0; i < completion.length; i++) {
				if (!participant[i].equals(completion[i])) return participant[i];
			}
			return participant[participant.length - 1];
			// 두번째
		}
	}
}
