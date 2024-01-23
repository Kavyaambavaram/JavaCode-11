package com.string;
          //convert string into lower case

public class Problem_1 {
	
	public static void main(String[] args) {
		String str="JAVA";
		char ch=' ';
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				ch=(char) (str.charAt(i)+32);  //+32 is used to convert uppercase to lowercase
			}System.out.print(ch);
		}
	}

}
