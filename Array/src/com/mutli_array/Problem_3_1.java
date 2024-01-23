package com.mutli_array;
                  //row changing from acessing order
public class Problem_3_1 {

	public static void main(String[] args) {
		int[][] arr = {{19,2,10},{25,20,21},{26,24,30}};
		int temp = 0;

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length-1;j++) {
				if(arr[i][j]>arr[i][j+1]) 
				{
					temp = arr[i][j];
					arr[i][j] = arr[i][j+1];
					arr[i][j+1] = temp;
				}
			}
		}
		 //showing matrix form
		
		for(int i=0;i<arr.length;i++) {      
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}



