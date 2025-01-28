package org.example.lesson_2.practice;

/**
 * App, которая проверяет, является ли строка палиндромом.
 * Палиндром — это строка, которая читается одинаково слева направо и справа налево (например, "level", "madam").
 */
public class Palindrome {

    public static boolean checkPalindrome(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return string.equalsIgnoreCase(stringBuilder.reverse().toString());
    }

}
