package org.example.lesson_2.homework.for_loops;

import java.util.Scanner;

/**
 * App, где пользователь вводит число N.
 * Выведите все чётные числа от 1 до N.
 */
public class EvenNumbers {

    public static void evenNumbers() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число");
        int number = sc.nextInt();

        System.out.print("Четные числа: ");

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i  + " ");
            }
        }
    }
}
