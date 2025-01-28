package org.example.lesson_2.practice;

import java.util.HashSet;

/**
 * App, которая проверяет, содержатся ли дубликаты в массиве. Если дубликаты найдены, верните true, если нет — false.
 */
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] array) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : array) {
            // Если не получается добавить, то возвращает true
            if (!hashSet.add(i)) {
                return true;
            }
        }
        return false;
    }

}
