package org.example.lesson_2.practice;

/**
 * App, которая находит максимальную сумму всех чисел в подмассиве для заданного массива.
 * Например, для массива {1, -2, 3, 4, -1, 2, 1, -5, 4} максимальная сумма подмассива будет равна 6 (для подмассива {3, 4, -1, 2, 1}).
 */
public class MaxSubarraySum {

    public static int maxSubarraySum(int[] array) {
        int maxCurrent = array[0];
        int maxGlobal = array[0];

        for (int i = 0; i < array.length; i++) {
            maxCurrent = Math.max(array[i], maxCurrent + array[i]);
            maxGlobal = Math.max(maxGlobal, maxCurrent);
        }
        return maxGlobal;
    }
}
