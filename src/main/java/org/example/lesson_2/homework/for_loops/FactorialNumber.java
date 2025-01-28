package org.example.lesson_2.homework.for_loops;

import java.util.Scanner;

/**
 * App, которая вычисляет факториал числа N (N! = 1 * 2 * ... * N).
 */
public class FactorialNumber {

    public static void factorialNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");

        int number = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + number + " -> " + factorial);
    }

}
