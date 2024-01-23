package com.arrays;
                // Position of an elements in an given array
public class Problem2 {
	public static int position(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
			}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {10,21,32,11,19,20};
		System.out.println(Problem2.position(arr,19));
	}

}
