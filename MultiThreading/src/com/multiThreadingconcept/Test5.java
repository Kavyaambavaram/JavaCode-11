package com.multiThreadingconcept;

class T5 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Priority : "+Thread.currentThread().getPriority());
	}
}

public class Test5 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" Priority : "+Thread.currentThread().getPriority());
		T5 t5 = new T5();
		T5 t = new T5();
		t5.setName("A");
		t.setName("B");
			t.setPriority(Thread.MAX_PRIORITY);
			t5.setPriority(Thread.MIN_PRIORITY);
		t5.start();
		t.start();

	}

}
