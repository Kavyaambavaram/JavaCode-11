package com.exceptionhandling;

public class FinallyWithReturnStatement {
	public static int m1(int a, int b) {
		try {
			System.out.println(a/b);
			return 0;
		}catch(Exception e){
			return -1;
		}finally {
			return 3;
		}
	}

	public static void main(String[] args) {
		// If we have return statement inside finally block,
		// it will override all the return statements present in the try and catch block 
		System.out.println(m1(12,3));
		System.out.println("-----------");
		System.out.println(m1(12,0));

	}

}