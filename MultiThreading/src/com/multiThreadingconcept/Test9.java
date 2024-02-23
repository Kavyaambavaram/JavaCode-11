package com.multiThreadingconcept;

class SharedResource{
	public static final String resource1 = "Pen";
	public static final String resource2 = "Paper";
}

class TA extends Thread{
	public void run(){
		synchronized (SharedResource.resource1) {
			System.out.println("TA got a pen.Waiting for paper");
			synchronized (SharedResource.resource2) {
				System.out.println("TA got paper.Completed its task");
			}
		}
	}
}

class TB extends Thread{
	public void run(){
		synchronized (SharedResource.resource1) {
			System.out.println("TB got paper.Waiting for pen");
			synchronized (SharedResource.resource2) {
				System.out.println("TB got pen.Completed its task");
			}
		}
	}
}

public class Test9 {

	public static void main(String[] args) throws InterruptedException{
		TA tA = new TA();
		TB tB = new TB();
		tA.start();
		//tA.join();
		tB.start();

	}

}
