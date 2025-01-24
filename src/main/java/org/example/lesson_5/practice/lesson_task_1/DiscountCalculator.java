package org.example.lesson_5.practice.lesson_task_1;

import static org.example.lesson_5.practice.lesson_task_1.CustomerType.VIP;

public class DiscountCalculator {
//    Реализация 1
//    public static double calculateDiscount(String customerType, double amount) {
//        if (customerType.equals("regular")) {
//            return amount * 0.05;
//        } else if (customerType.equals("vip")) {
//            return amount * 0.10;
//        } else if (customerType.equals("employee")) {
//            return amount * 0.30;
//        } else return 0;
//    }

    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategyHandler().getStrategy(VIP);
        System.out.println(discountStrategy.calculate(500));
    }

}
