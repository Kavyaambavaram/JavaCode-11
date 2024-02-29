package com.arrays;

public class LargestPalindrome {
    public static boolean isPalindrome(int num) {
        int orgNum = num;
        int revNum = 0;

        while (num > 0) {
            revNum = revNum * 10 + num % 10;
            num = num / 10;
        }
        return orgNum == revNum;
    }
    public static void main(String[] args) {
    	
        long largestPalindrome = 0;
        int[] array = {1221, 12321, 123, 321123, 98789 };

        for (int num : array) {
            if (isPalindrome(num) && num > largestPalindrome) {
                largestPalindrome = num;
            }
        }
        System.out.println("Largest palindrome in the array: " + largestPalindrome);
    }
}
