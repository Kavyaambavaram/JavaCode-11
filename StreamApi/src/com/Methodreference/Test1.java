package com.Methodreference;

import java.util.Arrays;
 
interface A{
//	String changeToUpperCase(String str);
//	int[] sortNumber(int[] arr);
	
//	String[] sortNames(String[] arr);
	void printName(String str);
}

class Arithmetic{
	public int[] sortArray(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}
	
	public static String[] sortName(String[] arr) {
		Arrays.sort(arr);
		return arr;
	}
}

public class Test1 {

	public static void main(String[] args) {
//		A a = String::toUpperCase;
//		System.out.println(a.changeToUpperCase("java"));
		
//		int[] arr = {6,4,7,8,2,3,5};
//		Arithmetic obj = new Arithmetic();
//		A a = obj::sortArray;
//		System.out.println(Arrays.toString(a.sortNumber(arr)));
		
//		String[] names = {"Sridhar", "Likhith", "Amogha", "Chida"};
//		A a = Arithmetic::sortName;
//		System.out.println(Arrays.toString(a.sortNames(names)));
		
		A a = System.out::print;
		a.printName("Hello! Sridhar");
	}

}
