package org.example.lesson_2.practice;

/**
 * Метод который проверяет является ли число четным или нечетным, если нечетная выводит число, если четное то не выводит
 */
public class EvenOdd {
    public static void dividedEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
