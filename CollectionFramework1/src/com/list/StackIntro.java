package com.list;

import java.util.Stack;

public class StackIntro {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		//Stack is empty
		System.out.println(stack.isEmpty());
		
		//push elements to stack
		//stack.push(10);
		for(int i=10;i<=70;i=i+10) {
			stack.push(i);
		}
		System.out.println(stack);
		
		
		//Check who is my head element
		System.out.println(stack.peek());
		
		//get Index element
		for(int i=0;i<stack.size();i++) {
			if(stack.get(i)==stack.peek()) {
				System.out.println(i);
			}
		}
		System.out.println(stack.indexOf(50));
		int key=40;
		if(stack.contains(key)) {
			System.out.println(stack.indexOf(key));
		}
		
		//can we update the value of stack
		System.out.println(stack);
		System.out.println(stack.set(3, 100));
		System.out.println(stack);
		
		//remove the element
		System.out.println(stack.remove(5));
		System.out.println(stack);//remove==>always take index position only
	}

}