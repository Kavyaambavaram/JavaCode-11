package com.loops;

import java.util.Scanner;

public class Test4 {
	public static void m1() {
		System.out.println("m1() is called");
	}
	public static void m2() {
		System.out.println("m2() is called");
	}
	public static void m3() {
		System.out.println("m3() is called");
	}
	public static void m4() {
		System.out.println("m4() is called");
	}
	public static void main(String[] args) {
		char ch;
		do {
			System.out.println("Select the option");
			System.out.println("1.m1() 2.m2() 3.m3()");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			switch (option) {
			case 1:m1();
				break;
			case 2:m2();
				break;
			case 3:m3();
				break;
			case 4:m4();
				break;
			default:
				System.out.println("Invalid option");
			}
			System.out.println("Do you want to continue :y/n");
			ch= sc.next().charAt(0); //read first character
		} while (ch == 'y');
		
		System.out.println("Thanks!!!");
	}
}
