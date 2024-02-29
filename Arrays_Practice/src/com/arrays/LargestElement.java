package com.arrays;

public class LargestElement {
	public static void largest(int[] arr) {
		int maxelement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxelement) {
                maxelement = arr[i];
            }
        }
			System.out.println("Largest element in the Array is: " +maxelement);		
		}

	public static void main(String[] args) {
		int[] arr = { 55,77,11,22,88 };
		LargestElement.largest(arr);	
	}
}
