package org.example.lesson2.practice;

/**
 * Метод который считает факториал числа
 */
public class Factorial {

    public static int factorial(int number) {
        int result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        return result;
    }

}
