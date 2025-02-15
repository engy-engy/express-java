package org.example.lesson_2.homework.nested_loops;

import java.util.Scanner;

/**
 * App, которая выводит пирамиду из звёздочек высотой N.
 */
public class PyramidOfStars {

    public static void pyramidOfStars() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
