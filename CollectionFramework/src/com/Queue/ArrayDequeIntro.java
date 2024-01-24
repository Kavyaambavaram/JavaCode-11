package com.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeIntro {

	public static void main(String[] args) {
	   Deque<Integer> deque = new ArrayDeque<>();
	   
	   //add elements
	   for(int i=1;i<=5;i++) {
		   deque.add(i);
	   }
	   System.out.println(deque);
	   
	   //add element at the begining
	   deque.addFirst(100);
	   System.out.println(deque);
	   
	   //add element at the end 
	   deque.addLast(200);
	   System.out.println(deque);
	   
	   //accessing the first element
	   System.out.println(deque.peekFirst());
	   
	   //accessing the last element
	   System.out.println(deque.peekLast());
	   
	   //remove data first and last
	   System.out.println(deque.pollFirst());
	   System.out.println(deque);
	   
	   System.out.println(deque.pollLast());
	   System.out.println(deque);
	}

}
