package com.string;

public class Prioblem_3 {
	public static void reverse(String str) {
		String[] arr=str.split(" ");
		String newString="";
		for(int i=0;i<arr.length;i++) {
			newString = newString+" "+getReverse(arr[i]);
		}
		System.out.println(newString);
	}
	private static String getReverse(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		String str="Java is a Programming language";
	System.out.println("Original String:"+str);
	reverse(str);
	}
}
