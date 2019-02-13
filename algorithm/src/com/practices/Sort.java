package com.practices;

public class Sort {
	public void HQuickSort(int[] arr, int low, int high) {
		if (low < high) {
			int p = HPartition(arr, low, high);
			HQuickSort(arr, low, p);
			HQuickSort(arr, p + 1, high);
		}
	}


	private int HPartition(int[] arr, int low, int high) {
		int pivot = arr[(low + high) / 2];
		int i = low - 1;
		int j = high + 1;
		while (true) {
			do {
				i += 1;
			} while (arr[i] < pivot);
			do {
				j -= 1;
			} while (arr[j] > pivot);

			if (i >= j) return j;
			swap(arr, i, j);
		}
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void LQuickSort(int[] arr, int low, int high) {
		if (low < high) {
			int p = LPartition(arr, low, high);
			LQuickSort(arr, low, p - 1);
			LQuickSort(arr, p + 1, high);
		}
	}

	private int LPartition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				swap(arr, i, j);
				i += 1;
			}
		}
		swap(arr, i, high);
		return i;
	}


}


