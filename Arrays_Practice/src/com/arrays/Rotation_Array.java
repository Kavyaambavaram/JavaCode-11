package com.arrays;

import java.util.Arrays;

public class Rotation_Array {
    public static void rotateLeftRight(int[] arr) {
        int temp = arr[arr.length-1]; //last element of an array arr[4]=5
        for (int i =arr.length-1;i>0;i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		Rotation_Array.rotateLeftRight(arr);
	}

}
