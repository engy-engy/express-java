package org.example.lesson_5.practice.lesson_task;

import org.example.lesson_5.practice.lesson_task.discount.DiscountEmployeeStrategy;
import org.example.lesson_5.practice.lesson_task.discount.DiscountRegularStrategy;
import org.example.lesson_5.practice.lesson_task.discount.DiscountVipStrategy;

public class DiscountStrategyHandler {

    public DiscountStrategy getStrategy(CustomerType customerType) {
        return switch (customerType) {
            case REGULAR -> new DiscountRegularStrategy();
            case VIP -> new DiscountVipStrategy();
            case EMPLOYEE -> new DiscountEmployeeStrategy();
            default -> throw new IllegalArgumentException("Unknown customer type");
        };
    }
}
