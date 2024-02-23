package com.generics;

public class Test3 {
	public void getSum(int a, int b) {
		System.out.println(a+b);
	}
	// Generic Method
	public <T extends Number>void addData(T obj, T obj2) {
		System.out.println(obj.doubleValue()+obj2.doubleValue());
	}

	public static void main(String[] args) {
		new Test3().addData(10.5, 20.6);
		new Test3().addData(10.4f, 20.7f);
		new Test3().addData(10, 20);

	}

}

