package org.example.lesson_4.homework.task_1;
import java.util.Arrays;

/**
 * метод, который принимает массив целых чисел и возвращает сумму всех элементов массива.
 */
public class ArraysStructure {

    public static int sumArrays(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть null.");
        }

        int sum = 0;

        for (int el : array) {
            sum += el;
        }

        return sum;
    }

    public static int sumArrays2(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть null.");
        }

        // Используется stream API из библиотеки java.util.Arrays.
        // Метод Arrays.stream(array) создаёт поток элементов массива,
        // а sum() подсчитывает их сумму.
        return Arrays.stream(array).sum();
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.printf("Сумма элементов массива = %d%n", sumArrays(a));
        System.out.printf("Сумма элементов массива = %d%n", sumArrays2(a));
    }
}
