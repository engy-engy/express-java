package org.example.lesson_2.homework.if_switch;

/**
 * App, которая проверяет, является ли число чётным или нечётным.
 */
public class CheckEvenNumber {

    public static void checkEvenNumber(int a) {
        if (a % 2 == 0) {
            System.out.println("Число " + a + " четное");
            return;
        }
        System.out.println("Число " + a + " нечётное");
    }

}
