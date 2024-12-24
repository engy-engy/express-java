package org.example.lesson2.practice;


/** Напишите программу, которая принимает два числа и
 * выполняет их сложение, вычитание, умножение и деление.
 * Используйте методы для выполнения каждой операции.
 */
public class Calculator {

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Can't divide by zero");
            return 0;
        }
        return a / b;
    }
}
