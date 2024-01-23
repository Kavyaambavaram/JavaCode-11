package com.abstraction;

interface Bank{
	//public ,static and final
	int sharePrice = 123;
	
	double rateOfInterest();
	
	public default void FD(){
		System.out.println("FD service is available.");
	}
	
	public static void LoanService(){
		System.out.println("Loan service is available.");
	}
}

class SBI implements Bank{

	@Override
	public double rateOfInterest() {
		// TODO Auto-generated method stub
		return 13.25;
	}
	
}

public class Interfaces {

	public static void main(String[] args) {
		//Bank bank = new Bank();
		System.out.println(Bank.sharePrice);
		//Bank.sharePrice = 145;
		Bank.LoanService();
		
		SBI sbi = new SBI();
		System.out.println(sbi.rateOfInterest());
		sbi.FD();
		

	}

}