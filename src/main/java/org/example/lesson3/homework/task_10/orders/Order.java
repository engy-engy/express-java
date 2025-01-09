package org.example.lesson3.homework.task_10.orders;

import org.example.lesson3.homework.task_10.products.Product;
import org.example.lesson3.homework.task_10.users.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Order class, реализует интерфейс DatabaseOperations (getOrder, saveOrder),
 * описывает поля и методы для работы с заказом
 */
public class Order {

    private final String orderId;
    private Customer customer;
    private ArrayList<Product> productList;
    private double totalPrice;

    public Order(String orderId, Customer customer, ArrayList<Product> productList) {
        this.orderId = orderId;
        this.customer = customer;
        this.productList = new ArrayList<>(productList);
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
