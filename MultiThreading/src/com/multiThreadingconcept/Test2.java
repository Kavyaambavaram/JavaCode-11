package com.multiThreadingconcept;

class T2 implements Runnable{
	public void run() {
		System.out.println("Thread Executed..!");
	}
}

public class Test2 {

	public static void main(String[] args) {
		T2 t2 = new T2();
		Thread th = new Thread(t2);
		th.start();

	}

}
