package com.mutli_array;

import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row position");
		int row = sc.nextInt();
		System.out.println("Enter the column position");
		int cols = sc.nextInt();
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==row || j==cols) {
					arr[i][j]=0;
				}System.out.println(arr[i][j]+" ");
			}System.out.println();
		}
	}
}
