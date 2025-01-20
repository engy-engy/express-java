package org.example.lesson_4.homework.task_9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Метод, который использует приоритетную очередь для сортировки массива целых чисел по убыванию.
 *
 */
public class PriorityQueues {

    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) {return new int[0];}

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a); // b - a Задает направление сортировки

//      PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

//        Компаратор возвращает результат сравнения:
//	    - Eсли b > a, результат будет положительным, a встанет ниже b.
//	    - Если b == a, результат будет 0, и порядок этих элементов не изменится.
//	    - Если b < a, результат будет отрицательным, b встанет ниже a.
//      PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<>() {
//          @Override
//          public int compare(Integer a, Integer b) {
//              return b - a; // Сравнение чисел по убыванию
//          }
//      });

        for (Integer el : array) {
            queue.add(el);
        }

        int[] reversed = new int[array.length];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = queue.poll();
        }

        return reversed;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(sort(a)));

    }
}
