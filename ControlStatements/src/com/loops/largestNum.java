package com.loops;

import java.util.Scanner;

public class largestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the i value");
		int i=sc.nextInt();
		System.out.println("Enter the j value");
		int j=sc.nextInt();

		if(i>j) {
			System.out.println("The largest number between "+ i +" and "+j + " is: " +i);
		}else {
			System.out.println("The largest number between "+ i +" and "+j + " is: " +j);
		}
	}

}
