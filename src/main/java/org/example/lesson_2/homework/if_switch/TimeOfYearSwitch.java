package org.example.lesson_2.homework.if_switch;

import java.util.Scanner;

/**
 * App, пользователь вводит номер месяца (1-12). Выведите название соответствующего времени года, используя switch.
 */
public class TimeOfYearSwitch {

    public static void timeOfYearSwitch() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер месяца");

        switch (sc.nextInt()) {
            case 1:
            case 12:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Месяца под номером " + sc.nextInt() + " не соответствует времени года.");
        }
    }
}
