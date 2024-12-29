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

    @Override
    public String toString() {
        return String.format("Item: name=%s | price=%.2f | quantity=%d", name, price, quantity);
    }

    public static void main(String[] args) {
        Item item = new Item("Apple", 1.5, 10);
        System.out.println(item);
        item.sell(5);
        System.out.println(item);
        item.restock(24);
        System.out.println(item);
        System.out.println(item.getInfo());
    }

}
