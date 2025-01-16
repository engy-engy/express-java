package org.example.lesson_4.practice;

import java.util.Arrays;

public class ReverseArrays {

    // Пример с памятью с длинною в массив
    public static int[] reverse(int[] array){

        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - 1 - i];
        }

        return newArray;
    }

    // Пример с константной памятью (дешевле по памяти)
    public static int[] reverse2(int[] array){

        int n = array.length;

        for (int i = 0; i < array.length; i++) {
            // временно сохраняем значение текущего элемента
            int temp = array[i];
            // записываем в текущий элемент значение из противоположной стороны
            array[i] = array[ n - 1 - i];
            // записываем сохраненное значение на противоположную сторону
            array[n - 1 - i] = temp;
        }

        return array;
    }
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(reverse(a)));
        System.out.println(Arrays.toString(reverse2(a)));
    }
}


