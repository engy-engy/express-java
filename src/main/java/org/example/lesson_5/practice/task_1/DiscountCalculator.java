package org.example.lesson_5.practice.task_1;

import org.example.lesson_5.practice.task_1.strategy.DiscountStrategy;

import static org.example.lesson_5.practice.task_1.CustomerType.VIP;

public class DiscountCalculator {

    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategyHandler().getStrategy(VIP);
        System.out.println(discountStrategy.calculate(500));
    }

}
