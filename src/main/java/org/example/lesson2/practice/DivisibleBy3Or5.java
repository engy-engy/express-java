package org.example.lesson2.practice;

/**
 *  Метод который выводит все числа от 1 до 100 которые делятся на 3 или на 5 без остатка
 */
public class DivisibleBy3Or5 {

    public static void divide3Or5() {
        for (int i = 1; i <= 100; i++ ) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

}
