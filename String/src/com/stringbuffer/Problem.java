package com.stringbuffer;

public class Problem {

	public static void main(String[] args) {
		String str="java";
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		System.out.println(sb.toString()); // convert to stringbuffer to string objects

	}

}
