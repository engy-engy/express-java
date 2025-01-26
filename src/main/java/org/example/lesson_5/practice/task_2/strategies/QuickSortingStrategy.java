package org.example.lesson_5.practice.task_2.strategies;

import java.util.Arrays;

public class QuickSortingStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using quick sort " + Arrays.toString(array));
    }
}
