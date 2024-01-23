package com.exceptionhandling;

public class ThrowKeyword {
	public static void AgeVerification(int age) {
		if(age>=18) {
			System.out.println("Proceeding. Please Wait..!");
		}else {
			throw new ArithmeticException();
		}
	}

	public static void main(String[] args) {
		AgeVerification(18);
		System.out.println("------------");
		AgeVerification(17);

	}

}