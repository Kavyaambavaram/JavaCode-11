package com.stringbuffer;

public class Test {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); //excutes the main method as thread here

		StringBuffer sb=new StringBuffer();
		sb.append("Java");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		sb.append("World");
		System.out.println(sb.hashCode());
		System.out.println(sb);
	}
}
