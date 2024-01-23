package com.string;

public class Test {

	public static void main(String[] args) {
		String str = "java";
		String str1 = "java";
		if(str==str1) {
			System.out.println("Points to the same object");
		}else {
			System.out.println("Points the different objects");
		}
		System.out.println(str.compareTo(str1));
		
		if(str.equals(str1)) {
			System.out.println("Content are same");
		}else {
				System.out.println("Content are different");
			}
		}
	}
