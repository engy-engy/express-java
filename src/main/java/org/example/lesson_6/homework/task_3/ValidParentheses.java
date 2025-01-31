package org.example.lesson_6.homework.task_3;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        if (s == null || !s.isEmpty()) return false;

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
              stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String input1 = "()[]{}";
        String input2 = "()]{}";
        String input3 = "({[(]})";
        String input4 = "{";
        String input5 = "";

        System.out.println(isValid(input1));
        System.out.println(isValid(input2));
        System.out.println(isValid(input3));
        System.out.println(isValid(input4));
        System.out.println(isValid(input5));

    }
}
