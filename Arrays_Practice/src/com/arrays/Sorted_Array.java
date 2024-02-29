package com.arrays;

import java.util.Arrays;

public class Sorted_Array {
	public static void Sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr= {7,8,3,1,2,15,9,5};
		Sorted_Array.Sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		// Using another way of printing sorted Array in array format
		System.out.println(Arrays.toString(arr));

	}

}
