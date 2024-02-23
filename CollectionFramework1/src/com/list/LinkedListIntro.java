package com.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListIntro {
	static LinkedList<Integer> list = new LinkedList<>();
	public static void printLinkedList() {
		System.out.print("Head ->");
		for(Integer data:list) {
			System.out.print(data+" --->");
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// Check list is empty or not
		System.out.println(list.isEmpty());
		list.add(10);
		list.add(20);
		list.add(30);
		printLinkedList();
		
		// Add element at the beginning
		list.addFirst(100);
		printLinkedList();
		
		// Add element at the end
		list.addLast(200);
		printLinkedList();
		
		// add element at given position
		list.add(3, 1000);
		printLinkedList();
		
		// read head element
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		
		// read element from end
		System.out.println(list.peekLast());
		
		// read element at given index
		System.out.println(list.get(3));
		
		// delete head element
		System.out.println(list.poll());
		printLinkedList();
		
		// delete last element
		System.out.println(list.pollLast());
		printLinkedList();
		
		// delete element from given index position
		System.out.println(list.remove(2));
		printLinkedList();

	}

}