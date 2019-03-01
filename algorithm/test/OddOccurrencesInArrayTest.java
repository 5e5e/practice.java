import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddOccurrencesInArrayTest {
	private static final Logger logger = LoggerFactory.getLogger(OddOccurrencesInArrayTest.class);
	private OddOccurrencesInArray oddOccurrencesInArray;

	@BeforeEach
	public void setup() {
		oddOccurrencesInArray = new OddOccurrencesInArray();
	}

	@Test
	public void testCase1() {
		int[] testData = {9, 3, 9, 3, 9, 7, 9};
		assertEquals(7, oddOccurrencesInArray.solution(testData));
	}

	@Test
	public void testCase2() {
		int[] testData = {2, 2, 3, 3, 4};
		assertEquals(4, oddOccurrencesInArray.solution(testData));
	}

	private class OddOccurrencesInArray {

		public int solution(int[] A) {
			int answer = 0;
			for (int i = 0; i < A.length - 1; i++) {
				if (A[i] != 0) {
					for (int j = i + 1; j < A.length; j++) {
						if (A[i] == A[j]) {
							A[i] = 0;
							A[j] = 0;
							break;
						}
					}
				}
			}

			for (int index : A) {
				if (index != 0) {
					answer = index;
					break;

				}
			}
			return answer;
		}
	}
}
