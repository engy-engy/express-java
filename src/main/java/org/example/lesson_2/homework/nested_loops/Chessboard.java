package org.example.lesson_2.homework.nested_loops;

import java.util.Scanner;

/**
 * App, которая выводит шахматную доску размером N x N, где клетки чередуются символами # и .
 */
public class Chessboard {

    public static void chessboard() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер шахматной доски N x N");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i +j) % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

    }
}
