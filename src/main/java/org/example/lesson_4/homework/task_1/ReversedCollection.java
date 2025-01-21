package org.example.lesson_4.homework.task_1;

import java.util.ArrayList;

/**
 * Перевернуть коллекцию
 * Разработать функцию, которая принимает коллекцию элементов и возвращает её в обратном порядке.
 * Определите, какой тип коллекции обеспечит наиболее эффективное выполнение этой задачи
 */
public class ReversedCollection {

    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(reverse(list));
    }
}
