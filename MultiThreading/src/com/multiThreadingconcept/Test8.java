package com.multiThreadingconcept;


class Balance{
	int balAmount = 1000;
	
	public synchronized void withdrawAmount(int amount) throws InterruptedException{
		System.out.println("Start withdrawing....");
		if(balAmount<amount){
			System.out.println("Insufficient balance");
			wait();
		}
		System.out.println("Amount withdrawn successfully");
	}
	
	public synchronized void depositAmount(int amount){
		this.balAmount = this.balAmount+amount;
		System.out.println("Amount deposited successfully");
		notify();
	}
}

class Friend1 extends Thread{
	private Balance balance;
	Friend1(Balance balance){
		this.balance = balance;
	}
	
	public void run(){
		try {
			this.balance.withdrawAmount(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Friend2 extends Thread{
	private Balance balance;
	Friend2(Balance balance){
		this.balance = balance;
	}
	public void run(){
		this.balance.depositAmount(500);
	}
}
public class Test8 {

	public static void main(String[] args) {
		Balance bal = new Balance();
		Friend1 user = new Friend1(bal);
		Friend2 user2 = new Friend2(bal);
		
		user.start();
		user2.start();

	}

}
