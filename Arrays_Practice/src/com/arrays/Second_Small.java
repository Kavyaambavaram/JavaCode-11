package com.arrays;

public class Second_Small {
	public static void SecondSmall(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.print("Smallest element in the Array is : " + arr[1]);
	}

	public static void main(String[] args) {
		int[] arr = { 7, 8, 3, 11, 2, 15,};
		SecondSmall(arr);
	}
}