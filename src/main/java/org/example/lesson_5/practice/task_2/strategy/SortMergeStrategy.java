package org.example.lesson_5.practice.task_2.strategy;

import java.util.Arrays;

public class SortMergeStrategy implements SortStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using merge sort " + Arrays.toString(array));
    }
}
