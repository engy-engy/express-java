package org.example.lesson_5.practice.lesson_task;

public class DiscountCalculator {

    public static double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("regular")) {
            return amount * 0.05;
        } else if (customerType.equals("vip")) {
            return amount * 0.10;
        } else if (customerType.equals("employee")) {
            return amount * 0.30;
        } else return 0;
    }
}
