package com.exceptionhandling;

public class ExceptionIntro {
	public void printState() {
		System.out.println("Statement-1");
		System.out.println("Statement-2");
		int result = 12/0; // Exception
		System.out.println("Statement-3");
		System.out.println("Statement-4");
	}

	public static void main(String[] args) {
		ExceptionIntro obj = new ExceptionIntro();
		obj.printState();

	}

}