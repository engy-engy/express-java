package org.example.lesson_2.homework.if_switch;

import java.util.Scanner;

/**
 * App, которая проверяет, делится ли число на 3 и 5 одновременно.
 */
public class CheckDivision {

    public static void checkDivision() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");

        int number = sc.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Делится на 3 и 5");
        } else {
            System.out.println("Не делится на 3 и 5");
        }

    }

}
