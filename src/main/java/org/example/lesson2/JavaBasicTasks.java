package org.example.lesson2;

public class JavaBasicTasks {

    // Метод который выводит все числа от 1 до 100 которые делятся на 3 или на 5 без остатка
    public static void dividedThree() {
        for (int i = 1; i <= 100; i++ ) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    // Метод который проверяет является ли число четным или нечетным, если нечетная выводит число, если четное то не выводит
    public static void dividedEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    // Метод который принимает массив чисел и сортирует их в порядке убывания
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

    // Метод который считает факториал числа
    public static int factorial(int number) {
        int result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        return result;
    }

}
