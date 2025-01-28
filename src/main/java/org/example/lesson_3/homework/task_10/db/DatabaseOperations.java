package org.example.lesson_3.homework.task_10.db;

import org.example.lesson_3.homework.task_10.orders.Order;

/**
 * Интерфейс DatabaseOperations, с методами сохранения и получения Order
 */
public interface DatabaseOperations {

    void saveOrder(Order order);
    Order getOrder(String orderId);
}
