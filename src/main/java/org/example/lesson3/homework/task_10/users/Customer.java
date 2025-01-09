package org.example.lesson3.homework.task_10.users;

import org.example.lesson3.homework.task_10.products.Product;

import java.util.ArrayList;

/**
 * Customer class, подкласс описывающий метод добавления товара в корзину и получения товаров в корзине
 */
public class Customer extends User {

    private ArrayList<Product> cart = new ArrayList<>();

    public Customer(String id, String name, String email) {
        super(id, name, email);
        this.cart = new ArrayList<>();
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public void addProduct(Product product) {
        this.cart.add(product);
    }

}
