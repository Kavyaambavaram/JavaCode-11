package com.multiThreadingconcept;

class ChildThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Child Thread Started");
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+" ----> "+i);
		}
		System.out.println(Thread.currentThread().getName()+" Child Thread Completed");
	}
}

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread Started");
		ChildThread ch = new ChildThread();
		ch.start();
		// it will execute first
		ch.join(); // it will take control from current thread and is given to calling Thread
		
		ChildThread ch1 = new ChildThread();
		ch1.start();
		ch1.join();
		
		for(int i=11; i<=15; i++) {
			System.out.println(Thread.currentThread().getName()+" ----> "+i);
		}
		System.out.println("Main Thread Completed");

	}

}