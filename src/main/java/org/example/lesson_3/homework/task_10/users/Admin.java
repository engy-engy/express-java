package org.example.lesson_3.homework.task_10.users;

import org.example.lesson_3.homework.task_10.products.Product;

/**
 * Admin class, подкласс описывающий метод изменения цены
 */
public class Admin extends User {

    public Admin(String id, String name, String email) {
        super(id, name, email);
    }

    public void updatePrice(Product product, double newPrice) {
        product.setPrice(newPrice);
    }

}
