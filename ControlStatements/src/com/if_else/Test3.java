package com.if_else;

import java.util.Scanner;


public class Test3 {
//	public static void showGrade(int marks) // void function
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the marks");
//		int entermarks = sc.nextInt();
//		if(entermarks>=80) {
//			System.out.println(marks+"Distinction");
//		}else if(entermarks>=60 && entermarks<80) {
//			System.out.println(marks+"1st Division");
//		}else if(entermarks>=35 && entermarks<59) {
//			System.out.println(marks+"2nd Division");
//		}else {
//			System.out.println("Try Again!");
//		}
//	}
//	
	public static String showGrade(int marks) { // return type using string
        if (marks >= 80) {
            return "Distinction";
        } else if (marks >= 60 && marks < 80) {
            return "1st Division";
        } else if (marks >= 35 && marks < 59) {
            return "2nd Division";
        } else {
            return "Try Again!";
        }
	}

	public static void main(String[] args) {
		System.out.println(Test3.showGrade(67));
//		Test3.showGrade(52);

	}

}
