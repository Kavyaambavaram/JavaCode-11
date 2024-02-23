package com.lambdaExpressions;

@FunctionalInterface
interface Car{
//	void speed();
//	void structure(int num);
	
	int sumOfElements(int[] a);
}

class Sum{
	public static int addElements(int[] a) {
		int sum=0;
		for(int data:a) {
			sum=sum+data;
		}
		return sum;
	}
}

public class Test {

	public static void main(String[] args) {
		// Syntax of lambda expression is ()->{};
		
//		Car car = ()->{System.out.println("110k/hr");};
//		car.speed();
		
//		Car car = (num)->{System.out.println("Car have "+num+" wheels");};
//		car.structure(4);
		
		//lambda functions 
		
//		Car car = (arr)->{
//			int sum =0;
//			for(int data:arr) {
//				sum=sum+data;
//			}
//			return sum;
//		};
//		int[] arr = {1,2,3,4,5,6};
//		System.out.println(car.sumOfElements(arr));
		
		int[] arr = {1,2,3,4,5,6};
		Car car = Sum::addElements;
		System.out.println(car.sumOfElements(arr));
	}

}
