package org.example.lesson_5.practice.lesson_task.discount;

import org.example.lesson_5.practice.lesson_task.DiscountStrategy;

public class DiscountRegularStrategy implements DiscountStrategy {
    @Override
    public double calculate(double amount) {
        return amount * 0.05;
    }
}
