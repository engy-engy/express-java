package org.example.lesson_5.homework.task_2.strategies;

import java.util.Arrays;

public class BubbleSortingStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using bubble sort " + Arrays.toString(array));
    }
}
