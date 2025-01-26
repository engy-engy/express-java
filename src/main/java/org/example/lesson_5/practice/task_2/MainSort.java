package org.example.lesson_5.practice.task_2;

import org.example.lesson_5.practice.task_2.strategy.SortStrategy;

import static org.example.lesson_5.practice.task_2.SortType.*;

public class MainSort {
//  Старая реализация
//    public class Sorter {
//        public void sort(int[] array, String algorithm) {
//            if (algorithm.equals("bubble")) {
//                // Реализация пузырьковой сортировки
//                System.out.println("Sorting using bubble sort");
//            } else if (algorithm.equals("merge")) {
//                // Реализация сортировки слиянием
//                System.out.println("Sorting using merge sort");
//            } else if (algorithm.equals("quick")) {
//                // Реализация быстрой сортировки
//                System.out.println("Sorting using quick sort");
//            } else {
//                throw new IllegalArgumentException("Unsupported sorting algorithm: " + algorithm);
//            }
//        }
//    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9,10};

        SortStrategy bubbleStrategy = SortStrategyHandler.getStrategy(BUBBLE);
        SortStrategy mergeStrategy = SortStrategyHandler.getStrategy(MERGE);
        SortStrategy quickStrategy = SortStrategyHandler.getStrategy(QUICK);

        bubbleStrategy.sort(a);
        mergeStrategy.sort(a);
        quickStrategy.sort(a);
    }
}
