package org.example.lesson_2.practice;

/**
 * App, которая находит наибольшее из трех введенных чисел.
 */
public class MaxNumber {
    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
}
