package org.example.lesson_4.practice.task_2;

/**
 * функция, которая принимает строку и возвращает её в обратном порядке.
 */
public class Strings {

    public static String reverseString(String string) {
        if (string == null || string.isEmpty()) {
            return String.format("Строка '%s' не может быть пустой или null",string);
        }
        return new StringBuilder(string).reverse().toString();
    }

    public static String reverseString2(String string) {
        if (string == null || string.isEmpty()) {
            return String.format("Строка '%s' не может быть пустой или null",string);
        }

        char[] reversed = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            reversed[i] = string.charAt(string.length() - 1 - i);
        }
        return new String(reversed);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
        System.out.println(reverseString2("Hello World"));
    }
}
