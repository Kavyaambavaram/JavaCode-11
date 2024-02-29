package com.arrays;

public class NonRepeating {
	public static void NonRepeatingElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == Integer.MIN_VALUE) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = Integer.MIN_VALUE;
				}
			}
			if (count == 1) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 5 };
		System.out.print("Non-repeating elements are : ");
		NonRepeating.NonRepeatingElements(arr);
	}
}
