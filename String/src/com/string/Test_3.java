package com.string;

class Employee{
	String name="Sathya";
	
	public String toString() {
		return this.name;
		
	}
}

public class Test_3 {

	public static void main(String[] args) {
		String str ="code";
		System.out.println(str.toString());
		
		Employee emp=new Employee();
		System.out.println(emp);
	}

}
