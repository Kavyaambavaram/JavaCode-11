package com.loops;

import java.util.Scanner;

public class Cubeofnum {  
	    public static void showData(int num){
	      int k=num*num*num;
	        System.out.println(k);
	    }    
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); // taken input by user
		 System.out.println("Enter the value");
		 int cube = sc.nextInt();
		 Cubeofnum.showData(cube);
		 
	}

}


                             // another way without writing function

//public static void main(String[] args) 
//{
//	int number, cube;
//	Scanner sc = new Scanner(System.in);
//	System.out.print(" Please Enter any Number : ");
//	number = sc.nextInt();		
//	cube = number * number * number;
//	System.out.println("The Cube of a Given Number  " + number + "  =  " + cube);
//}
//}
