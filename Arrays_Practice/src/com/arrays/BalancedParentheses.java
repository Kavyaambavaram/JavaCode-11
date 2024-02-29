package com.arrays;
import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch:s.toCharArray()) {
            if(ch =='(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String balancedString = "{[()]}";
        String unbalancedString = "{[(])}";

        System.out.println( balancedString + " --> is a balanced? " + isBalanced(balancedString));
        System.out.println(unbalancedString + " --> is a balanced? " + isBalanced(unbalancedString));
    }
}
