package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//return all the intergers having starting with 2
//return list of integers that having starting of 2 

public class Problem3 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,222,234,567,819,432,236,212,22);
	    List<Integer> result = list.stream().map(x ->String.valueOf(x)).filter(x->x.startsWith("2")).map(x->Integer.parseInt(x)).collect(Collectors.toList());
		System.out.println(result);
	}

}
