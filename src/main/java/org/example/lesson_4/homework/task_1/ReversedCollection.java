package org.example.lesson_4.homework.task_1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Перевернуть коллекцию
 * Разработать функцию, которая принимает коллекцию элементов и возвращает её в обратном порядке.
 * Определите, какой тип коллекции обеспечит наиболее эффективное выполнение этой задачи
 */
public class ReversedCollection {

    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
//      Сложность по времени:
//		- Обход исходного списка выполняется за O(n), где n — размер списка.
//		- Каждое добавление элемента в новый ArrayList выполняется за O(1).
//		- Итоговая сложность: O(n).
//      Сложность по памяти:
//		- Новый список того же размера создаётся для хранения перевёрнутых элементов.
//		- Потребление памяти увеличивается вдвое (2 \times n), поскольку создается новый список.

        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    public static void reverse2(ArrayList<Integer> list) {
//      - Не создаётся новый список.
//		- Сложность по времени O(n), сложность по памяти O(1).
//		- Используется встроенный метод Collections.reverse().
        Collections.reverse(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("reverse 1: " + reverse(list));

        reverse2(list);
        System.out.println("reverse 2: " + list);
    }
}
