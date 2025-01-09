package org.example.lesson3.homework.task_10.db;
import org.example.lesson3.homework.task_10.orders.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * Интерфейс для работы с базой данных заказов, используя HashMap
 */
public class OrderDatabase implements DatabaseOperations {

    private Map<String, Order> orders = new HashMap<>();

    @Override
    public void saveOrder(Order order) {
        orders.put(order.getOrderId(), order);
        System.out.printf("Order saved with id = %s\n", order.getOrderId());
    }

    @Override
    public Order getOrder(String orderId) {
        Order order = orders.get(orderId);
        if (order == null) {
            throw new NoSuchElementException("Order not found!");
        }
        return order;
    }
}