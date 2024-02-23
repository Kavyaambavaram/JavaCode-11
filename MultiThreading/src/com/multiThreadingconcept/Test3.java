package com.multiThreadingconcept;

class T3 extends Thread{
	public void run() {
		try {
			Thread.sleep(1000); // Blocked state
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Running state
		System.out.println(Thread.currentThread().getName());
	}
}

public class Test3 {

	public static void main(String[] args) {
		T3 t3 = new T3(); // new state
		t3.start(); // runnable state

	}

}
