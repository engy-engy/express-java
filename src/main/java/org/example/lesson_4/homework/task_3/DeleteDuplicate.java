package org.example.lesson_4.homework.task_3;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Удаление дубликатов
 * Создать функцию, которая очищает коллекцию от дублирующихся элементов.
 * Выберите и обоснуйте использование конкретной структуры данных для этой операции.
 */
public class DeleteDuplicate {

    public static ArrayList<Integer> deleteDuplicates(ArrayList<Integer> arr) {
        if (arr == null || arr.isEmpty()) return null;

        HashSet<Integer> set = new HashSet<>(arr);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(5);

        System.out.println("Полный массив: " + arr);
        System.out.println("Послу удаления массив: " + deleteDuplicates(arr));
    }
}
