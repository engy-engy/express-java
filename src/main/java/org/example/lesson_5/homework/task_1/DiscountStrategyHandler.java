package org.example.lesson_5.homework.task_1;

import org.example.lesson_5.homework.task_1.strategy.DiscountEmployeeStrategy;
import org.example.lesson_5.homework.task_1.strategy.DiscountRegularStrategy;
import org.example.lesson_5.homework.task_1.strategy.DiscountStrategy;
import org.example.lesson_5.homework.task_1.strategy.DiscountVipStrategy;

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
