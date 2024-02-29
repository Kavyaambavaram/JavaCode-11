package com.arrays;

public class FrequencyOfElements {
	public static void findFrequency(int[] arr) {
		int n =arr.length;
		for (int i=0;i<n;i++) {
			if (arr[i]==Integer.MIN_VALUE) {
				continue;
			}
			int count=1;
			for (int j=i+1;j<n;j++) {
				if (arr[i]==arr[j]) {
					count++;
					arr[j]=Integer.MIN_VALUE;
				}
			}
			System.out.println("Frequency of "+arr[i]+" is "+count);
		}
	}
	public static void main(String[] args) {
		int[] arr = { 1,2,3,2,4,5,1,4,5,1,2,5,3 };
		findFrequency(arr);
	}
}
