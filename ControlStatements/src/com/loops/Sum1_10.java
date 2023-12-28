package com.loops;

public class Sum1_10 {
	int sum= 0;
	public void showData() {
		for(int i=1;i<=10;i++) { 
			sum = sum+i;
//			System.out.println(sum); // to show the all values in every single iteration
		}
		System.out.println("Sum of numbers from 1 to 10 is:"+sum);
	}
	public static void main(String[] args) {
		Sum1_10 s= new Sum1_10();
		s.showData();

	}

}
