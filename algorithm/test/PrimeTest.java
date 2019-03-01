import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class PrimeTest {
	private static final Logger logger = LoggerFactory.getLogger(PrimeTest.class);
	List<Data> dataList = new ArrayList<>();

	@Test
	public void prinme() {
		int n = 33;
		int answer = 0;
		List<Integer> integers = getPrime(n);
		int[] array = integers.stream().mapToInt(i -> i).toArray();
		answer = combination(n, array);
	}

	private int combination(int inputValue, int[] arr) {
		int n = arr.length;
		int r = 3;
		int[] combArr = new int[n];
		doCombination(inputValue, combArr, n, r, 0, 0, arr);
		logger.debug(dataList.size()+"");
		return dataList.size();
	}

	public void doCombination(int inputValue, int[] combArr, int n, int r, int index, int target, int[] arr) {

		List<Integer> integers = new ArrayList<>();
		if (r == 0) {
			int result = 0;
			for (int i = 0; i < index; i++) {
				integers.add(arr[combArr[i]]);
			}
			for (Integer integer : integers) {
				result += integer;
			}
			if (result == inputValue) {
				dataList.add(new Data((result)));
			}
			integers.clear();
		} else if (target == n) return;
		else {
			combArr[index] = target;
			doCombination(inputValue, combArr, n, r - 1, index + 1, target + 1, arr);
			doCombination(inputValue, combArr, n, r, index, target + 1, arr);
		}
	}

	private List<Integer> getPrime(int n) {
		List<Boolean> primeList = primeList = new ArrayList<Boolean>(n + 1);
		List<Integer> result = new ArrayList<>();
		primeList.add(false);
		primeList.add(false);
		for (int i = 2; i <= n; i++)
			primeList.add(i, true);
		for (int i = 2; (i * i) <= n; i++) {
			if (primeList.get(i)) {
				for (int j = i * i; j <= n; j += i) {
					primeList.set(j, false);

				}
			}
		}
		for (int i = 0; i <= n; i++) {
			if (primeList.get(i) == true) {
				result.add(i);
			}
		}
		return result;
	}

	private class Data {

		private int result;

		public Data(int result) {
			this.result = result;
		}

	}
}
