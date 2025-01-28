package org.example.lesson_2.homework.nested_loops;

/**
 * App, выводит таблицу умножения от 1 до 10 в формате:
 * python
 * 1 x 1 = 1
 * 1 x 2 = 2
 * ...
 * 10 x 10 = 100
 */
public class MultiTable {

    public static void multiTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.printf("%d * %d = %d%n", i, j, i * j);
            }
        }
    }
}
