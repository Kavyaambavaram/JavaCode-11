package com.arrays;

public class Reverse {
	static void ReverseArray(int[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr= {5,6,7,8,9,10};
		ReverseArray(arr);

	}

}
