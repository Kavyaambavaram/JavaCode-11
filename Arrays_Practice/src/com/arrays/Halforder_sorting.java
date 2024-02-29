package com.arrays;

//first half assending order and second half decending order

public class Halforder_sorting {
	public static void AsendingDecending(int[] arr) {
		int k = arr.length;
		for (int i = 0; i < k / 2 - 1; i++) {
			for (int j = 0; j < k / 2 - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = k / 2; i < k - 1; i++) {
			for (int j = k / 2; j < k - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 2, 6, 8, 1, 12, 10 };
		Halforder_sorting.AsendingDecending(arr);
	}

}
