package com.arrays;

import java.util.Arrays;

//public class Sum_Elements {
//	public static void sumofElements(int[] arr) {
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			sum+=arr[i];
//		}
//	        System.out.println("Sum of elements in array is: "+sum);
//	}
//
//	public static void main(String[] args) {
//		int[] arr= {5,4,3,2,1};
//		sumofElements(arr);
//	}
//
//}

            //using lamda function
//
public class Sum_Elements {
    public static void sumOfElements(int[] arr) {
        int sum = Arrays.stream(arr).reduce(0, (a, b) -> a + b);
        System.out.println("Sum of elements in array is: "+sum);
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sumOfElements(arr);
    }
}