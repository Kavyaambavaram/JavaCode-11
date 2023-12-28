package com.loops;

import java.util.Scanner;

public class Mutlipication_table {
	public void multiple() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int m = sc.nextInt();
		for (int i = 0; i <= 10; i++) {
			System.out.println(m + "*" + i + "=" + m * i);
		}
	}
	public static void main(String[] args) {
		Mutlipication_table mt = new Mutlipication_table();
		mt.multiple();
	}
}
