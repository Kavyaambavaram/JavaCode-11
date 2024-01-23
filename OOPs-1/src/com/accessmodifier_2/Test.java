package com.accessmodifier_2;

import com.accessmodifier.Student;
        //outside packages
public class Test {

	public static void main(String[] args) {
		Student s1=new Student();
//		System.out.println(s1.data);   //default data not allow
		System.out.println(s1.data2);  //public data allowed
//		System.out.println(s1.data3);  //private data is only access within class through the public function it can access
		System.out.println(s1.getData());  //only access because it is public function ==if it is a default it not allowed 
//		System.out.println(s1.data4);   ==>protected data is unable to access 

		System.out.println("Child class outside the package");
		EC obj2=new EC();
//		System.out.println(obj2.data);
		System.out.println(obj2.data2);
//		System.out.println(obj2.data3);
//		System.out.println(obj2.data4);
	}

}
