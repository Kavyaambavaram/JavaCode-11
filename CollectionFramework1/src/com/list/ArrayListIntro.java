package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Maintains the insertion order, Null and Duplicate values are allowed in ArrayList
public class ArrayListIntro {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		// adding objects to arrayList
		list.add(10);
		list.add(18);
		list.add(17);
		list.add(null);
		list.add(10);
		
		// Fist In First Out
		System.out.println(list);
		
		// Access the object from arrayList
		System.out.println(list.get(2));
		
		// Traversing the arrayList
		// For loop
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" "); // Way of accessing the elements in arrayList
		}
		System.out.println();
		
		// Enhanced for loop
		for(Integer obj : list) {
			System.out.print(obj+" ");
		}
		System.out.println();
		
		// Using iterator method
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		// Delete
		System.out.println(list);
		System.out.println(list.remove(0));
		System.out.println(list);
		
		// Contains (Returns true or false) 
		System.out.println(list.contains(1));
		System.out.print(list.contains(18));
			
	}

}