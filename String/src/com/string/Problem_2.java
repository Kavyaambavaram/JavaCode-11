package com.string;

public class Problem_2 {
	public static void reverse(String str) {
		String reversedword="";
		String[] arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			reversedword=reversedword+" "+arr[i];
		}
		System.out.println(reversedword);
	}

	public static void main(String[] args) {
		String str="Java is a programming language";
		reverse(str);
	}
}