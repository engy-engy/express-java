package org.example.lesson2.homework;

import java.util.Scanner;

/**
 * Калькулятор с использованием switch, который выполняет операции +, -, *, /, используя switch.
 */
public class CalculatorSwitch {

    public static void calculatorSwitch() {

        Scanner sc = new Scanner(System.in);
        int first;
        int second;

        while (true) {

            System.out.println("Введите первое число");
            first = sc.nextInt();
            sc.nextLine();

            System.out.println("Введите второе число");
            second = sc.nextInt();
            sc.nextLine();

            System.out.println("Введите операцию: [+] [-] [*] [/] [exit]");
            switch (sc.nextLine().toLowerCase()) {
                case "+":
                    System.out.println("Результат сложения: " + (first + second));
                    break;
                case "-":
                    System.out.println("Результат вычитания: " + (first - second));
                case "/":
                    if (second == 0) {
                        System.out.println("На ноль делить нельзя");
                        break;
                    }
                    System.out.println("Результат деления: " + (first / second));
                    break;
                case "*":
                    System.out.println("Результат умножения: " + (first * second));
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Такой операции нет" + sc.nextLine());
            }

        }

    }

}
