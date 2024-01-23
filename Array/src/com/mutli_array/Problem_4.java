package com.mutli_array;

public class Problem_4 {

	public static void main(String[] args) {
		int[] arr = {4,5,6,9,1,10,11};
		int sum=10;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[i]+arr[j]==sum) {
//					System.out.println(arr[i]+arr[j]);
					System.out.print(arr[i]);
					System.out.println(arr[j]);
				}
		}
	}
}
}
