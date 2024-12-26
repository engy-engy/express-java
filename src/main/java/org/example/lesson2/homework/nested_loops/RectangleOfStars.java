package org.example.lesson2.homework.nested_loops;

import java.util.Scanner;

/**
 * App, которая выводит прямоугольник из звёздочек размером M x N (пользователь вводит размеры).
 */
public class RectangleOfStars {

    public static void rectangleOfStars() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер прямоугольника M x N");

        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
