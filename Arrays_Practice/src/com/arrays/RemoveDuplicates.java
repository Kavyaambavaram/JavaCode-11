package com.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 2, 3, 6, 8, 5};

        Set<Integer> duplicateSet = new HashSet<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicateSet.add(arr[i]);
                    break;
                }
            }
        }
        System.out.println("Duplicates in the array: " + duplicateSet);

        List<Integer> uniqueList = new ArrayList<>();
        for (int num : arr) {
            boolean isDuplicate = false;
            for (int uniqueNum : uniqueList) {
                if (num == uniqueNum) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueList.add(num);
            }
        }
        int[] uniqueArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }
        System.out.println("Array after removing the duplicates: " + Arrays.toString(uniqueArray));
    }
}
