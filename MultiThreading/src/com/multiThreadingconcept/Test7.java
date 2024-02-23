package com.multiThreadingconcept;

class Table{
	public synchronized void printTable(int num) {
		try {
		System.out.println(Thread.currentThread().getName()+" started and acquired the lock");
		for(int i=1; i<=10; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
			
				Thread.sleep(2000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(Thread.currentThread().getName()+" completed and released the lock");
	}
}

class Child1 extends Thread{
	private Table table;
	Child1(Table table){
		this.table = table;
	}
	public void run() {
		this.table.printTable(2);
	}
}

class Child2 extends Thread{
	private Table table;
	Child2(Table table){
		this.table = table;
	}
	public void run() {
		this.table.printTable(5);
	}
}

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		Table tb = new Table();
		Child1 ch1 = new Child1(tb);
		Child2 ch2 = new Child2(tb);
		
		ch1.start();
		ch2.start();

	}

}
