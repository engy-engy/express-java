package org.example.lesson_5.practice.lesson_task_1.strategy;

import org.example.lesson_5.practice.lesson_task_1.DiscountStrategy;

public class DiscountRegularStrategy implements DiscountStrategy {
    @Override
    public double calculate(double amount) {
        return amount * 0.05;
    }
}
