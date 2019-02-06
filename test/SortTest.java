import com.practices.Sort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class SortTest {
	private Sort sort;

	@BeforeEach
	public void setUp() {
		sort = new Sort();

	}

	@Test
	public void test0() {
		int[] arr0 = {};
		int[] sortedArr0 = {};
		sort.HQuickSort(arr0, 0, arr0.length - 1);
		assertArrayEquals(sortedArr0, arr0);
	}

	@Test
	public void test1() {
		int[] arr1 = {1};
		int[] sortedArr1 = {1};
		sort.HQuickSort(arr1, 0, arr1.length - 1);
		assertArrayEquals(sortedArr1, arr1);
	}

	@Test
	public void test2() {
		int[] arr2 = {6, 4, 1, 8, 9, 2, 7, 5, 3};
		int[] sortedArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		sort.HQuickSort(arr2, 0, arr2.length - 1);
		assertArrayEquals(sortedArr2, arr2);
	}

	@Test
	public void test3() {
		int[] arr3 = {5, 5, 5, 5, 5, 5, 5, 5, 5};
		int[] sortedArr3 = {5, 5, 5, 5, 5, 5, 5, 5, 5};
		sort.HQuickSort(arr3, 0, arr3.length - 1);
		assertArrayEquals(sortedArr3, arr3);
	}

	@Test
	public void test5() {
		int[] arr0 = {};
		int[] sortedArr0 = {};
		sort.LQuickSort(arr0, 0, arr0.length - 1);
		assertArrayEquals(sortedArr0, arr0);
	}

	@Test
	public void test6() {
		int[] arr1 = {1};
		int[] sortedArr1 = {1};
		sort.LQuickSort(arr1, 0, arr1.length - 1);
		assertArrayEquals(sortedArr1, arr1);
	}

	@Test
	public void test7() {
		int[] arr2 = {6, 4, 1, 8, 9, 2, 7, 5, 3};
		int[] sortedArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		sort.LQuickSort(arr2, 0, arr2.length - 1);
		assertArrayEquals(sortedArr2, arr2);
	}

	@Test
	public void test8() {
		int[] arr3 = {5, 5, 5, 5, 5, 5, 5, 5, 5};
		int[] sortedArr3 = {5, 5, 5, 5, 5, 5, 5, 5, 5};
		sort.LQuickSort(arr3, 0, arr3.length - 1);
		assertArrayEquals(sortedArr3, arr3);
	}

	@Test
	public void test9() {
		int[] arr = {6, 4, 2, 10, 9, 1, 7, 11, 5, 3, 0, 8};
		int[] sortedArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		sort.LQuickSort(arr, 0, arr.length - 1);
		assertArrayEquals(sortedArr, arr);
	}
}
