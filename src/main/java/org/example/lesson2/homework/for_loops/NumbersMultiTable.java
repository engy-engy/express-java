package org.example.lesson2.homework.for_loops;

import java.util.Scanner;

/**
 * App, где пользователь вводит число. Выведите таблицу умножения для этого числа от 1 до 10.
 */
public class NumbersMultiTable {

    public static void numbersMultiTable() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число");
        int number = sc.nextInt();

        System.out.println("Таблица умножения");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
