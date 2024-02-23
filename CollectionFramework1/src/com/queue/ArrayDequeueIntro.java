package com.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueIntro {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		
		// Add Element
		for(int i=0; i<=5; i++) {
			deque.add(i);
		}
		System.out.println(deque);
		
		// Add element at the beginning
		deque.addFirst(100);
		System.out.println(deque);
		
		// Add element at the end
		deque.addLast(200);
		System.out.println(deque);
		
		// Accessing the elements (Only First and Last Elements)
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
		
		// Remove element (Only First and Last Element)
		System.out.println(deque.pollFirst());
		System.out.println(deque);
		System.out.println(deque.pollLast());
		System.out.println(deque);

	}

}