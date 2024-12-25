package org.example.lesson2.homework;

import java.util.Scanner;

/**
 * App, которая принимает два числа с консоли, складывает их и выводит разность.
 */
public class AdditionSubtraction {

    public static void additionSubtraction(int a, int b) {
        int addition = a + b;
        int subtract = a - b;
        System.out.println("Сумма: " + addition);
        System.out.println("Разница: " + subtract);
    }

}
