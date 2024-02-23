package com.wrapperClassess;

public class Test1 {

	public static void main(String[] args) {
		int data = 10; // primitive data type
// Converting primitive data type to their respective wrapper object is known as "AutoBoxing"
		Integer obj = new Integer(data);
		System.out.println(obj instanceof java.lang.Integer);

	}

}