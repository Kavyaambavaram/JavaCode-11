package com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueIntro {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		
		queue.add(10);
		queue.add(5);
		queue.add(15);
		queue.add(2);
		queue.add(13);
		queue.add(9);
		queue.add(1);
		queue.add(3);
		
		System.out.println(queue);
		// Parent Node
		System.out.println(queue.peek());
		
		// Remove
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.peek());
		
		// contains
		System.out.println(queue.contains(1));

	}

}