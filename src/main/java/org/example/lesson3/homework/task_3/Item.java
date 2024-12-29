package org.example.lesson3.homework.task_3;

/**
 * Item, который будет представлять товар.
 */
public class Item {

    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String sell(int amount) {
        if (quantity < amount) return String.format("Недостаточно товара на складе. Остаток: %d", quantity);
        return String.format("Продано: %d. Остаток: %d", amount, quantity);
    }

    public int restock(int amount) {
        return quantity += amount;
    }

    public String getInfo() {
        return String.format("Name: %s%nPrice: %.2f%nQuantity: %d", name, price, quantity);
    }
}
