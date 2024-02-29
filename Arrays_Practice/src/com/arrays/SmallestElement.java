package com.arrays;

public class SmallestElement {
	public static void Smallest_Element(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
				}
			}
		}
		System.out.print("Smallest element in the Array is : "+arr[0]);
	}

	public static void main(String[] args) {
		int[] arr= {7,8,3,11,2,15,9,5};
		Smallest_Element(arr);
		}
}