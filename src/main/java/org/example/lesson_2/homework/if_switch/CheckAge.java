package org.example.lesson_2.homework.if_switch;

import java.util.Scanner;

/**
 *  App, которая определяет категорию человека по возрасту:
 * 0-12: Ребёнок
 * 13-17: Подросток
 * 18-64: Взрослый
 * 65+: Пенсионер.
 * Используйте if-else.
 */
public class CheckAge {

    public static void checkAge() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст");

        int age = sc.nextInt();

        if (age <= 12 && age >= 0) {
            System.out.println("Ребенок");
        } else if (age <= 17 && age >= 13) {
            System.out.println("Подросток");
        } else if (age <= 64 && age >= 18) {
            System.out.println("Взрослый");
        } else {
            System.out.println("Пенсионер");
        }
    }

}
