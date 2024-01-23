package com.exceptionhandling;

public class TryWithMultipleCatch {
	public static void m1() {
		try {
			System.out.println(12/0);
		}catch(NullPointerException npe){
			System.out.println("Exception Handled by 1st Catch");
		}catch(ArithmeticException ae) {
			System.out.println("Exception Handled by 2nd Catch");
		}catch(Exception e) {
			System.out.println("Exception Handled by 3rd Catch");
		}
	}

	public static void main(String[] args) {
		m1();

	}

}