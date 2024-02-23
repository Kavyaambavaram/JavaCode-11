package com.multiThreadingconcept;

// Here "Thread" is pre-defined class
class T1 extends Thread{
	public void run() {
		System.out.println("Inside run() ----> "+Thread.currentThread().getName());
	}
}

public class Test1 {
	public void m1() {
		System.out.println("Inside m1() ----> "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println("Inside main() ----> "+Thread.currentThread().getName());
		T1 t1 = new T1();
		t1.start();
		new Test1().m1();

	}

}