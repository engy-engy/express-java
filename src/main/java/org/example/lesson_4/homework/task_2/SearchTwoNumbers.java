package org.example.lesson_4.homework.task_2;

import java.util.HashSet;

/**
 * Поиск пары чисел
 * Написать метод, который ищет два числа в коллекции, сумма которых равна заданному значению.
 * Определите, какая структура данных лучше всего подойдёт для быстрого поиска.
 */
public class SearchTwoNumbers {

    public static void searchTwoNumbers2(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            // number, которое в сумме с el даст target
            int component = target - num;
            if (set.contains(component)) {
                // Выводим найденную пару
                System.out.println(component + " " + num);
            }
            // Добавляем текущее число в HashSet
            set.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        searchTwoNumbers2(arr1, 6);
    }
}
