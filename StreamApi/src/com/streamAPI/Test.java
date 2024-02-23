package com.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		//Creating Stream of objects:
		
		List<Integer> list= new ArrayList<>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		
		//insert the data using another way
		List<Integer> list2 = Arrays.asList(11,12,13,14,15,26,17);
		
		//Stream()-Sequence of elements
		Stream <Integer> stream= list.stream();
		//[1,2,3,4,5,6,7,8,9,10]
		
		//of()-another way of creating stream of objects
		Stream<String> stream2=Stream.of("Sathya","Ram","Aditya");
		Stream<Integer> stream3=list2.stream();
		
		
		//Intermediate operations & Terminal Operation(TO-Always single operation)
		//Filter function
		
		List<Integer> evenList=stream.filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		
		
		//map-->
		List<Integer> evenSquareNumber = stream3.filter(x->x%2==0).map(x->x*x).collect(Collectors.toList());
		System.out.println(evenSquareNumber);
		
		//Sorted()
		stream2.sorted().forEach(System.out::println);
		
		
		List<Integer> data = Arrays.asList(1,2,1,3,1,4,2,4,3,5);
		data.stream().distinct().forEach(System.out::println);
		
		//anyMatch()
		List<String> names =Arrays.asList("Ankith","Ashish","Adya","Vyshu","Vikky");
		boolean result = names.stream().anyMatch(x->x.startsWith("A"));
		System.out.println(result);
		
		//allMatch
		boolean result2 = names.stream().allMatch(x->x.startsWith("A"));
		System.out.println(result2);
		
		//reduce
		List<Integer>elements = Arrays.asList(1,2,3,4,5,6);
		int sum = elements.stream().reduce((a,b)->a+b).get();
		System.out.println(sum);
	}

}
