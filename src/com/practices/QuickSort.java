package com.practices;

public class QuickSort {
	public int[] quickSort(int[] arr) {
		if (arr.equals(null)) return null;
		return sort(arr, 0, arr.length - 1);
	}

	private int[] sort(int[] arr, int left, int right) {
		int[] result = arr;
		if (left >= right) return result;

		int pivot = partition(result, left, right);
		result = sort(result, left, pivot - 1);
		result = sort(result, pivot, right);
		return result;
	}

	private int partition(int[] arr, int left, int right) {
		if (arr == null || left < 0) return -1;
		int pivot = arr[right];
		int end = left - 1;

		for (int position = left; position < right; ++position) {
			if (pivot > arr[position]) {
				end += 1;
				swap(arr, position, end);
			}
		}
		end += 1;
		swap(arr, right, end);
		return end;
	}

	private void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}


