package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIntro {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		// Checking hashSet is empty or not
		System.out.println(set.isEmpty());
		
		// Size of the hashSet
		System.out.println(set.size());
		
		// Add elements
		set.add(13);
		set.add(1);
		set.add(15);
		set.add(2);
		
		System.out.println(set); // Doesn't maintain insertion order
		
		// add duplicates
		set.add(2);
		System.out.println(set); // Doesn't allows duplicate values
		
		// null value
		set.add(null);
		System.out.println(set); // allows null values and it is added at the beginning
		
		// traverse
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// checking elements
		System.out.println(set.contains(15));
		
		// remove elements
		System.out.println(set);
		System.out.println(set.remove(15));
		System.out.println(set);

	}

}