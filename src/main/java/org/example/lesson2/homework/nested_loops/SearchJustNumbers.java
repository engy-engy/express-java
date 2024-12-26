package org.example.lesson2.homework.nested_loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * App, которая находит все простые числа от 2 до N.
 * Используйте вложенные циклы для проверки делимости.
 */
public class SearchJustNumbers {

    public static void searchJustNumbers() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();

        List<Integer> justNumbers = new ArrayList<>();

        for (int i = 2; i <= n; i++) {

            boolean isJust = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isJust = false;
                    break;
                }
            }
            if (isJust) {
                justNumbers.add(i);
            }
        }
        System.out.println(Arrays.toString(justNumbers.toArray()));
    }
}
