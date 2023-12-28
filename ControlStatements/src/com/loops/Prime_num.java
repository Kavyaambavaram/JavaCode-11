package com.loops;

public class Prime_num {
	public void prime() {
		int num = 5;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
			System.out.println(num +" number not prime");
			return;
			}else {		
			System.out.println(num + " number is  prime");
			return;
		}
	}
	}

	public static void main(String[] args) {
		Prime_num p = new Prime_num();
		p.prime();
	}
}
