package com.generics;

class Employee{
	int id;
	String name;
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return "Employee "+this.id+" "+this.name;
	}
}

class GenericClass<T>{
	T obj;
	public GenericClass(T obj) {
		this.obj = obj;
	}
	@SuppressWarnings("unchecked")
	public T getType() {
		return this.obj;
	}
}

public class Test1 {

	public static void main(String[] args) {
		GenericClass obj = new GenericClass(new Integer(10));
		System.out.println(obj.getType());
		GenericClass obj1 = new GenericClass(new Float(10.5));
		System.out.println(obj1.getType());
		GenericClass obj2 = new GenericClass(new Double(10));
		System.out.println(obj2.getType());
		
		GenericClass obj3 = new GenericClass(new Employee(10, "Sridhar"));
		System.out.println(obj3.getType());

	}

}