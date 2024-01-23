package com.arrays;
// find the largest element in the array
public class Problem3 {
	public static int largestEle(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>ar.length) {
				return ar[i];
			}
		}
		return 0;		
	}

	public static void main(String[] args) {
		int[] ar = {1,49,27,12,98,42};
		System.out.println(Problem3.largestEle(ar));
	}

}
