package org.example.lesson_4.homework.task_3;

import java.util.ArrayList;
import java.util.List;

/**
 * метод, который принимает список целых чисел и удаляет из него все четные числа.
 */
public class Lists {

    public static void deleteElement(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        numbers.removeIf(el -> el % 2 == 0);
    }

    public static void deleteElement2(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }
    }

    public static void fillList(List<Integer> numbers) {
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();

        fillList(numbers);
        System.out.println(numbers);
        deleteElement(numbers);
        System.out.println(numbers);

        System.out.println("—————————————————");

        fillList(numbers2);
        System.out.println(numbers2);
        deleteElement2(numbers2);
        System.out.println(numbers2);

    }
}
