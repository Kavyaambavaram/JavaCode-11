package com.arrays;

public class Largest_smallest {
	public static void LargeSmallElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Smallest element in the Array is : " + arr[0]);
		System.out.println("Largest element in the Array is : " + arr[arr.length - 1]);
	}

	public static void main(String[] args) {
		int[] arr = { 7, 8, 3, 11, 22, 15, 9, 5 };
		LargeSmallElement(arr);
	}
}
