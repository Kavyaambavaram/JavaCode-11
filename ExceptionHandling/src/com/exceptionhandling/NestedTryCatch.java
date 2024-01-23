package com.exceptionhandling;

public class NestedTryCatch {
	public static void m1(int a, int b, String str) {
		try {
			System.out.println("Inside Outer try block");
			int result = a/b;
			System.out.println(result);
			try {
				System.out.println("Inside Inner Try block");
				System.out.println(str.length());
			}catch(Exception e) {
				System.out.println("Exception "+e.getClass()+" handled in inner catch block");
			}
		}catch(Exception e){
			System.out.println("Exception "+e.getClass()+" handled in outer catch block");
		}
	}

	public static void main(String[] args) {
		NestedTryCatch.m1(12, 4, "Java");
		System.out.println("-------------------");
		NestedTryCatch.m1(5, 0, "Java");
		System.out.println("-------------------");
		NestedTryCatch.m1(12, 3, null);

	}

}