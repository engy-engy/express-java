package org.example.lesson_2.homework.if_switch;

/**
 * App, которая принимает два числа и выводит результат их деления и остаток от деления.
 */
public class RemainderDivision {

    public static void remainderDivision(int a, int b) {
        if (b == 0) {
            return;
        }
        System.out.println("Результат деления: " + a / b);
        System.out.println("Результат остатка: " + a % b);
    }

}
