package com.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetIntro {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		
		// add elements
		set.add("Sridhar");
		set.add("Likhith");
		set.add("Amogh");
		
		System.out.println(set); // Maintains insertion order
		
		// Duplicate values
		set.add("Sridhar");
		System.out.println(set); // Duplicates are not allowed
		
		// null values
		set.add(null);
		System.out.println(set);
		
		// traverse
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// contains
		System.out.println(set.contains("Sridhar"));
		
		// remove
		if(set.contains(null)) {
			System.out.println(set.remove(null));
		}
		System.out.println(set);

	}

}