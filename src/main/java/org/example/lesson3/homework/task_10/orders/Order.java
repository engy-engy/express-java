package org.example.lesson3.homework.task_10.orders;

import org.example.lesson3.homework.task_10.products.Product;
import org.example.lesson3.homework.task_10.users.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Order class, реализует интерфейс DatabaseOperations (getOrder, saveOrder) и
 * описывает поля и методы для работы с заказом
 */
public class Order {

    private final String orderId;
    private Customer customer;
    private List<Product> productList;
    private double totalPrice;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.productList = new ArrayList<>(customer.getCart());
    }

    public String getOrderId() {
        return orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    public double calculateTotalPrice() {
        totalPrice = 0;
        for (Product product : productList) {
            product.applyDiscount(); // Применяем скидки
            this.totalPrice += product.getPrice();
        }
        return totalPrice;
    }

}
