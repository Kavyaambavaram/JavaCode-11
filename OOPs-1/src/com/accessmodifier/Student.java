package com.accessmodifier;

public class Student {
	//default access modifier
	
	int data=100;
	
	
	//public access modifier
	public int data2=200;
	
	//private access modifier
	private int data3=300;  //not working
	
	public int getData() {
		return data3;
	}
	
	//protected access modifier
	protected int data4=400;

}
 
