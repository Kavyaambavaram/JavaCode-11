package com.exceptionhandling;

public class CatchWithReturnStatement {
	public static int m1(int a, int b) {
		try {
			System.out.println(a/b);
			return 0;
		}catch(Exception e) {
			return 1;
		}
	}

	public static void main(String[] args) {
		System.out.println(m1(12,4));
		System.out.println("-----------");
		System.out.println(m1(12,0));

	}

}