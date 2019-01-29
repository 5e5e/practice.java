package com.practices;

public class QuickSort {
	public int[] quickSort(int[] arr) {
		if (arr.equals(null)) return null;
		return sort(arr, 0, arr.length - 1);
	}

	private int[] sort(int[] arr, int low, int high) {

		if (low < high) {
			int pivot = partition(arr, low, high);
			sort(arr, low, pivot);
			sort(arr, pivot + 1, high);
		}
		return arr;
	}

	private int partition(int[] arr, int low, int high) {
		int pivot = arr[(low + high) / 2];
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) i += 1;
			while (arr[j] > pivot) j -= 1;
			if (i < j) swap(arr, i, j);
			else return j;
		}
		return -1;
	}

	private void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}


