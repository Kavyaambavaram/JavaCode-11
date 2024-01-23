package com.accessmodifier;

public class Test {

	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1.data);
		System.out.println(s1.data2);
//		System.out.println(s1.data3);  not accessing thriugh this
		System.out.println(s1.getData());
		System.out.println(s1.data4);

		System.out.println("child class object");
		CSE obj=new CSE();
		System.out.println(obj.data);
		System.out.println(obj.data2);
		System.out.println(obj.getData());
		System.out.println(obj.data4);
		
		
	}

}
