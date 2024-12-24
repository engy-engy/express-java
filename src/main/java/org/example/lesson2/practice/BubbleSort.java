package org.example.lesson2.practice;

/**
 * Метод который принимает массив чисел и сортирует их в порядке убывания
 */
public class BubbleSort {

    public static int[] sortArray(int[] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        return array;
    }

}
