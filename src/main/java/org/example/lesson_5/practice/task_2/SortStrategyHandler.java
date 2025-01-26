package org.example.lesson_5.practice.task_2;


import org.example.lesson_5.practice.task_2.strategy.SortBubbleStrategy;
import org.example.lesson_5.practice.task_2.strategy.SortMergeStrategy;
import org.example.lesson_5.practice.task_2.strategy.SortQuickStrategy;
import org.example.lesson_5.practice.task_2.strategy.SortStrategy;

public class SortStrategyHandler {
    public static SortStrategy getStrategy(SortType sortType) {
        return switch (sortType) {
            case BUBBLE -> new SortBubbleStrategy();
            case MERGE -> new SortMergeStrategy();
            case QUICK -> new SortQuickStrategy();
            default -> throw new IllegalArgumentException("Invalid sort type");
        };
    }
}
