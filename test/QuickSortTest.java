import com.practices.QuickSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class QuickSortTest {
	@Test
	public void test() {
		QuickSort quickSort = new QuickSort();
		int[] arr1 = {};
		int[] sortedArr1 = {};
		assertArrayEquals(quickSort.quickSort(arr1), sortedArr1);
		int[] arr2 = {6, 4, 1, 8, 9, 2, 7, 5, 3};
		int[] sortedArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		assertArrayEquals(quickSort.quickSort(arr2), sortedArr2);
		int[] arr3 = {1};
		int[] sortedArr3 = {1};
		assertArrayEquals(quickSort.quickSort(arr3), sortedArr3);
		int[] arr4 = {6, 4, 2, 10, 9, 1, 7, 11, 5, 3, 0, 8};
		int[] sortedArr4 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		assertArrayEquals(quickSort.quickSort(arr4), sortedArr4);
	}

}
