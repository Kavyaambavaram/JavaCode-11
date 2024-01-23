package com.arrays;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		int[] ar = new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			ar[i] = sc.nextInt();
		}
         System.out.println("_______________________________________");
         System.out.println("Displaying elements of an array");
         for(int i=0;i<size;i++) {
        	 System.out.println(ar[i]+" ");
         }System.out.println();
	}

}
