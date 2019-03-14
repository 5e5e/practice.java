package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GenomicRangeQueryTest {
	private static final Logger logger = LoggerFactory.getLogger(GenomicRangeQueryTest.class);
	private GenomicRangeQuery genomicRangeQuery;

	@BeforeEach
	void setup() {
		genomicRangeQuery = new GenomicRangeQuery();
	}

	@Test
	void testCase1() {
		assertArrayEquals(new int[]{2, 4, 1}, genomicRangeQuery.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}));
	}

	private class GenomicRangeQuery {
		public int[] solution(String S, int[] P, int[] Q) {
			char[] cTemp = S.toCharArray();
			int[] iTemp = new int[cTemp.length];
			for (int i = 0; i < cTemp.length; i++) {
				if (cTemp[i] == 'A') iTemp[i] = 1;
				else if (cTemp[i] == 'C') iTemp[i] = 2;
				else if (cTemp[i] == 'G') iTemp[i] = 3;
				else iTemp[i] = 4;
			}
			int[] answer = new int[P.length];
			for (int i = 0; i < answer.length; i++) {
				int diff = Integer.MAX_VALUE;
				for (int j = P[i]; j <= Q[i]; j++) {
					diff = Math.min(diff, iTemp[j]);
				}
				answer[i] = diff;
			}

			return answer;
		}
	}
}
