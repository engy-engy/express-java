package org.example.lesson3.homework.task_6;

/**
 * Product, который будет представлять товар.
 */
public class Product implements Cloneable{

    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(){}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return 31 * id;
    }

    @Override
    public String toString() {
        return String.format("Product: id=%d | name=%s | price=%.2f", id, name, price);
    }

    @Override
    public Product clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Product(this.id, this.name, this.price);
        }
    }

    public static void main(String[] args) {
        Product product = new Product(1,"orange", 10.1);
        Product productClone = product.clone();
        System.out.println(product);
        System.out.println(productClone);
        System.out.println(product.equals(productClone));
    }

}
