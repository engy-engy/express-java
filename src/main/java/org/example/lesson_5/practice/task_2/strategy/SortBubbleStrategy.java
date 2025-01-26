package org.example.lesson_5.practice.task_2.strategy;

import java.util.Arrays;

public class SortBubbleStrategy implements SortStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using bubble sort " + Arrays.toString(array));
    }
}
