package com.arrays;

public class RepeatingElements {
	public static void RepeatElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 5, 1, 4, 2, 1 };
		System.out.print("Repeating elements in an array: ");
		RepeatingElements.RepeatElements(arr);
	}

}
