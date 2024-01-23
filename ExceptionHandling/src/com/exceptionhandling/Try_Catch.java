package com.exceptionhandling;

public class Try_Catch {
	public static void m1() {
		try {
			int i = 12/0;
			String str = null;
			System.out.println(str.length());
		}catch(Exception e){
			System.out.println("Exception Handled");
		}
		System.out.println("Out of Try_Catch");
	}

	public static void main(String[] args) {
		m1();

	}

}