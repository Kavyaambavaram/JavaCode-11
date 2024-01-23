package com.mutli_array;

              //check how many times the number will present in array 
public class Problem_1 {

	public static void main(String[] args) {
		int[][] arr= {{11,0,0},{0,21,22},{0,0,0}};
		int var =0;
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==var) {
				count++;	
				}
			}
		}System.out.println(count);

	}

}
