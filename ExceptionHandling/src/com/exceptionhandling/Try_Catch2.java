package com.exceptionhandling;

public class Try_Catch2 {
	public static void m1() {
		int i=12/0;
		System.out.println(i);
		try {
			String str = "Java";
			System.out.println(str.charAt(5));
		}catch(Exception e){
			System.out.println("Exception Handled");
		}
		System.out.println("Out of Try Catch");
	}

	public static void main(String[] args) {
		m1();

	}

}