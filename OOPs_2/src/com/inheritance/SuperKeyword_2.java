package com.inheritance;

class A {
	int data = 100;
}

class B extends A {
	int data = 200;

	public void showData() {
		int data = 300;
		System.out.println(super.data);
		System.out.println(this.data);
		System.out.println(data);
	}
}

public class SuperKeyword_2 {

	public static void main(String[] args) {
		B obj = new B();
		obj.showData();
	}

}
