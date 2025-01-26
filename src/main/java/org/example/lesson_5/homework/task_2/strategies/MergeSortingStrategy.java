package org.example.lesson_5.homework.task_2.strategies;

import java.util.Arrays;

public class MergeSortingStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using merge sort " + Arrays.toString(array));
    }
}
