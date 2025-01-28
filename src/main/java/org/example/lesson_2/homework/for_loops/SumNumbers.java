package org.example.lesson_2.homework.for_loops;

import java.util.Scanner;

/**
 * Пользователь вводит число N. Вычислите сумму всех чисел от 1 до N.
 * Пример:
 * Введите N: 5
 * Сумма: 15
 */
public class SumNumbers {

    public static void sumNumbers() {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Введите число число");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + n + " = " + sum );

    }

}
