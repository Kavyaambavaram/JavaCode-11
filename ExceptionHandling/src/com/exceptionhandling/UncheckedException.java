package com.exceptionhandling;

public class UncheckedException {
	public void checkingException() {
		//Arithmetic
//		System.out.println(12/0);
		
		// NullPointer
//		String str = null;
//		System.out.println(str.length());
		
		// NumberFormat Exception
//		String str = "123";
//		System.out.println(Integer.parseInt(str));
		
		// ArrayIndexOutOfBoundException
//		int[] arr = {1,2,3};
//		System.out.println(arr[3]);
		
		// StringIndexOutOfBoundException
//		String str = "java";
//		System.out.println(str.charAt(4));
	}

	public static void main(String[] args) {
		UncheckedException obj = new UncheckedException();
		obj.checkingException();

	}

}