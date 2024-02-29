package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class DistinctElements { 
    static void distinctElement(int[] array) {
        int count = 0;
        Set<Integer> distinctSet = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                distinctSet.add(array[i]);
                count++;
            }
        }
        for (int element : distinctSet) {
            System.out.print(element);
            System.out.print(" ");
        }
        
        System.out.println(" \nCount of distinct elements in the array: " + count);
        
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 5, 2, 3, 6, 8, 5};
        System.out.print("Distinct elements in array are: ");
        DistinctElements.distinctElement(array);
    }
}
