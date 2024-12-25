package org.example.lesson2.practice;

/**
 * Метод который считает факториал числа
 */
public class Factorial {

    public static int methodFactorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * methodFactorial(number - 1);
    }

    public static int factorial(int number) {
        int result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        return result;
    }

}
