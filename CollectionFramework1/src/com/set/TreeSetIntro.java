package com.set;

import java.util.TreeSet;

public class TreeSetIntro {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();

		// add elements
		set.add("Sridhar");
		set.add("Likhith");
		set.add("Amogh");
		
		System.out.println(set); // Doesn't maintains insertion order
		
		// duplicate values
		set.add("Sridhar");
		System.out.println(set);
		
		// null values
//		System.out.println(set.add(null)); // Null values are not allowed
		
	}

}