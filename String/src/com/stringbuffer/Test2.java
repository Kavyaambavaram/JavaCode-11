package com.stringbuffer;

public class Test2 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());

		sb.append("abcdefghijklmnopqr");
		System.out.println(sb.capacity());
		
		StringBuffer sb2=new StringBuffer(30);
		System.out.println(sb2.capacity());
	}

}
