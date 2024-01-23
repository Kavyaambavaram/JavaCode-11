package com.exceptionhandling;

public class FinallyBlock {
	public static void m1(int a, int b) {
		try {
			int result = a/b;
			System.out.println(result);
		}finally{
			System.out.println("Crucial Code Executed..!");
		}
		System.out.println("Outside try and finally block");
	}

	public static void main(String[] args) {
		FinallyBlock.m1(4, 2);
		System.out.println("-------");
		FinallyBlock.m1(2, 0);

	}

}