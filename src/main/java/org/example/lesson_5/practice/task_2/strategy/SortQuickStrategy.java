package org.example.lesson_5.practice.task_2.strategy;

import java.util.Arrays;

public class SortQuickStrategy implements SortStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using quick sort " + Arrays.toString(array));
    }
}
