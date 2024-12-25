package org.example;

import org.example.lesson1.Cashe;
import org.example.lesson1.CasheCustom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.lesson2.homework.AdditionSubtraction.additionSubtraction;
import static org.example.lesson2.practice.BubbleSort.sortArray;
import static org.example.lesson2.practice.Calculator.*;
import static org.example.lesson2.practice.ContainsDuplicate.containsDuplicate;
import static org.example.lesson2.practice.DivisibleBy3Or5.divide3Or5;
import static org.example.lesson2.practice.EvenOdd.dividedEvenOrOdd;
import static org.example.lesson2.practice.Factorial.factorial;
import static org.example.lesson2.practice.Factorial.methodFactorial;
import static org.example.lesson2.practice.MaxNumber.max;
import static org.example.lesson2.practice.MaxSubarraySum.maxSubarraySum;
import static org.example.lesson2.practice.Palindrome.checkPalindrome;
import static org.example.lesson2.practice.Reverse.reverse;

public class Main {
    public static void main(String[] args) {
        /**
         * Метод который выводит все числа от 1 до 100 которые делятся на 3 или на 5 без остатка
         */
        divide3Or5();

        /**
         * Метод который проверяет является ли число четным или нечетным, если нечетная выводит число, если четное то не выводит
         */
        dividedEvenOrOdd(2);

        /**
         * Метод который принимает массив чисел и сортирует их в порядке убывания
         */
        System.out.println(Arrays.toString(sortArray(new int[] {3,4,5,8,1,7})));

        /**
         * Метод который считает факториал числа
         */
        System.out.println(factorial(5));

        /** App, которая принимает два числа и
         * выполняет их сложение, вычитание, умножение и деление.
         * Используйте методы для выполнения каждой операции.
         */
        double num1 = 10, num2 = 5;

        System.out.println("Сложение: " + sum(num1, num2));
        System.out.println("Вычитание: " + subtract(num1, num2));
        System.out.println("Умножение: " + multiply(num1, num2));
        System.out.println("Деление: " + divide(num1, num2));

        /**
         * App, которая выводит числа от 10 до 1 в обратном порядке, используя цикл.
         */
        reverse();

        /**
         * App, которая находит наибольшее из трех введенных чисел.
         */
        System.out.println(max(5,3,4));
        System.out.println("--------------------------------------------------------------------------------");

        /**
         * Универсальный класс Cache
         */
        Cashe<Object, Object> cashe = new Cashe<>();
        CasheCustom casheCustom = new CasheCustom();
        cashe.put(casheCustom, "casheCustom");

        List list = new ArrayList();
        list.add("ABC");
        cashe.put("int1", 1);
        cashe.put("string", "Hello job");
        cashe.put(list, 4.3);
        cashe.put(true, false);

        System.out.println(cashe.get(4.3));
        System.out.println(cashe.get("int1"));
        System.out.println(cashe.get("string"));
        cashe.remove("int1");
        System.out.println(cashe.get("int1"));
        System.out.println(cashe.get(list));
        System.out.println(cashe.get(casheCustom));
        System.out.println("--------------------------------------------------------------------------------");


        /**
         * App, которая проверяет, является ли строка палиндромом.
         * Палиндром — это строка, которая читается одинаково слева направо и справа налево (например, "level", "madam").
         */
        System.out.println("Строка палиндром ? —> " + checkPalindrome("madam"));
        System.out.println("--------------------------------------------------------------------------------");

        /**
         * App, которая находит максимальную сумму всех чисел в подмассиве для заданного массива.
         * Например, для массива {1, -2, 3, 4, -1, 2, 1, -5, 4} максимальная сумма подмассива будет равна 6 (для подмассива {3, 4, -1, 2, 1}).
         */
        int[] ar = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        System.out.println("Максимальная сумма всех чисел подмассива: " + maxSubarraySum(ar));
        System.out.println("--------------------------------------------------------------------------------");

        /**
         * App, которая проверяет, содержатся ли дубликаты в массиве. Если дубликаты найдены, верните true, если нет — false.
         */
        int[] ar2 = {1, 2, 3, 4, 5,1};
        System.out.println("Содержание дубликатов: " + containsDuplicate(ar));
        System.out.println("--------------------------------------------------------------------------------");


        /**
         * Метод который считает факториал числа
         */
        System.out.println("Factorial: " + methodFactorial(5));
        System.out.println("--------------------------------------------------------------------------------");


        /**
         * App, которая принимает два числа с консоли, складывает их и выводит разность.
         */
        additionSubtraction(15,5);

    }
}