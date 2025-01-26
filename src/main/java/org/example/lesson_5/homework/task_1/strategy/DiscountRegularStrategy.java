package org.example.lesson_5.homework.task_1.strategy;

public class DiscountRegularStrategy implements DiscountStrategy {
    @Override
    public double calculate(double amount) {
        return amount * 0.05;
    }
}
