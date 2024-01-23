package com.string;

public class Test_2 {

	public static void main(String[] args) {
		String str="java";
		System.out.println(str);
		System.out.println(str.hashCode());
		
		str.concat("code"); // string can't be modified once object created (String immutable)
		System.out.println(str);

		str = str.concat(" code"); //when we reassign the same reference then another object is created
		System.out.println(str);
		System.out.println(str.hashCode());
	}

}
