package org.example.lesson_3.homework.task_10;

import org.example.lesson_3.homework.task_10.db.OrderDatabase;
import org.example.lesson_3.homework.task_10.orders.Order;
import org.example.lesson_3.homework.task_10.products.Clothing;
import org.example.lesson_3.homework.task_10.products.Electronics;
import org.example.lesson_3.homework.task_10.products.Product;
import org.example.lesson_3.homework.task_10.users.Admin;
import org.example.lesson_3.homework.task_10.users.Customer;

import java.util.HashMap;

public class MainMarket {
    public static void main(String[] args) {
        Customer customer = new Customer("test1", "Малевич Андрей", "adrey1@bk.ru");

        customer.displayUserInfo();

        Admin admin = new Admin("admin01", "Admin01", "admin01@admin.com");
        Product iphone = new Electronics("electrId001", "iPhone 16", 1000);
        Product jeans = new Clothing("clothId001", "Pair of Jeans", 60);

        System.out.printf("%s price = %.2f\n", iphone.getName(), iphone.getPrice());
        System.out.printf("%s price = %.2f\n", jeans.getName(), jeans.getPrice());

        admin.updatePrice(jeans, 40);
        System.out.printf("%s new price = %.2f\n", jeans.getName(), jeans.getPrice());

        customer.addProduct(iphone);
        customer.addProduct(jeans);

        Order order = new Order("orderId001", customer, customer.getCart());
        order.calculateTotalPrice();
        System.out.println("Total order price = " + order.getTotalPrice());


        OrderDatabase db = new OrderDatabase(new HashMap<>());
        db.saveOrder(order);

        Order retrievedOrder = db.getOrder(order.getOrderId());
        System.out.printf("Order retrieved. id = %s, total price = %.2f\n", retrievedOrder.getOrderId(), retrievedOrder.getTotalPrice());
    }
}
