package org.example.lesson2.homework;

/**
 * App, которая преобразует температуру из Цельсия в Фаренгейты:
 * Формула: F = C * 9/5 + 32.
 */
public class ConvertCelsiusToFahrenheit {

    public static int convertCelsiusToFahrenheit( double celsius) {
        return (int) Math.round(celsius * 9/5 + 32);
    }

}
