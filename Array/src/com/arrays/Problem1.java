package com.arrays;

public class Problem1 {
	public static int sum(int[] ar) {
		int sum =0;
		for(int i=0;i<ar.length;i++) {
			sum += ar[i];
		}return sum;
	}

	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5};
		int sum = Problem1.sum(ar);
		System.out.println(sum);
	}

}
