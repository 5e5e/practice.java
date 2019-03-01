import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddOccurrencesInArrayTest {
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
			int bounder = 0;
			for (int i = 0; i < A.length - 1; i += 2) {
				if (bounder == 0) {
					if (A[i] == A[i + 2]) {
						bounder = A[i];
						A[i] = 0;
					}
				} else {
					if (bounder == A[i]) A[i] = 0;
				}
			}
			bounder = 0;
			for (int i = 1; i < A.length - 3; i += 2) {
				if (bounder == 0) {
					if (A[i] == A[i + 2]) {
						bounder = A[i];
						A[i] = 0;
					}
				} else {
					if (bounder == A[i]) A[i] = 0;
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
