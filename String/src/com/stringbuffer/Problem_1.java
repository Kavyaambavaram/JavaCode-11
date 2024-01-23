package com.stringbuffer;

public class Problem_1 {
	public static void secondlargest() {
		int[] arr= {1,2,4,5,10};
		int largestnum=arr[0];
		
		for(int i=1;i<arr.length;i++) {
				if(arr[i]>largestnum) {
					largestnum=arr[i];
			}
				
		}
		int second=0;
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>second && arr[j]<largestnum)
			{
				second=arr[j];
			}
		}System.out.println(second);
	}
	
	public static void main(String[] args) {
		secondlargest();
	}
}
