package org.example.lesson_5.homework.task_2;


import org.example.lesson_5.homework.task_2.strategies.BubbleSortingStrategy;
import org.example.lesson_5.homework.task_2.strategies.MergeSortingStrategy;
import org.example.lesson_5.homework.task_2.strategies.QuickSortingStrategy;
import org.example.lesson_5.homework.task_2.strategies.SortingStrategy;

public class SortingStrategyHandler {
    public static SortingStrategy getStrategy(SortType sortType) {
        return switch (sortType) {
            case BUBBLE -> new BubbleSortingStrategy();
            case MERGE -> new MergeSortingStrategy();
            case QUICK -> new QuickSortingStrategy();
            default -> throw new IllegalArgumentException("Invalid sort type");
        };
    }
}
