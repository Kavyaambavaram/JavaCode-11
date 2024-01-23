package com.mutli_array;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
        //creating a 2-d array
		int[][] arr= {{1,2,3},{11,12,13},{21,22,23}}; //one way of creating array
		System.out.println(arr.length);
		
		//user input (another way for creating array)
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of rows");
//		int rows = sc.nextInt();
//		
//		System.out.println("Enter the number of columns");
//		int cols = sc.nextInt();
//		
//		int [][] arr2 = new int[rows][cols];
//		System.out.println("Enter the elements");
//		
//		for(int i=0;i<arr2.length;i++) {
//			for(int j=0;j<arr2[i].length;j++) {
//				arr2[i][j]=sc.nextInt();
//			}
//		}
//		System.out.println("_____________________________________");
//		System.out.println("Displaying elements");
//		for(int i=0;i<arr2.length;i++) {
//			for(int j=0;j<arr2[i].length;j++) {
//				System.out.print(arr2[i][j]+" ");
//			}
//			System.out.println();
//		}
		System.out.println("____________________________");
		System.out.println("Jagged Array");
		int[][]ar= {{1,2,3},{11,12},{21}};
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();

		}
	} 
}
