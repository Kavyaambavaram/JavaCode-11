package com.inheritance;

class Parent {
	private int data = 200;

	public int ParentClassProperty() {
		return this.data;
	}
}

class child extends Parent {
	private int data2 = 300;

	public int ChildClassProperty() {
		return this.data2;
	}

	public class SingleInheritance {

		public static void main(String[] args) {
			child obj = new child();
			System.out.println(obj.ParentClassProperty()); // child class
			System.out.println(obj.ChildClassProperty());

			Parent parent = new Parent();
			System.out.println(parent.ParentClassProperty());
//		System.out.println(parent.ChildClassProperty());    //parent class 

		}
	}
}
