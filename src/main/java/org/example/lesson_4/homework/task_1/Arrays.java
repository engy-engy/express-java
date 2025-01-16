package org.example.lesson_4.homework.task_1;

/**
 * метод, который принимает массив целых чисел и возвращает сумму всех элементов массива.
 */
public class Arrays {

    public static int sum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть null.");
        }

        int sum = 0;

        for (int el : array) {
            sum += el;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.printf("Сумма элементов массива = %d", sum(a));
    }
}
