package org.example.lesson3.homework.task_10.products;

/**
 * Clothing class, подкласс описывает метод для применения скидки на товары одежды
 */
public class Clothing extends Product {

    public Clothing(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void applyDiscount() {
        if (this.getPrice() > 50) {
            this.setPrice(this.getPrice() * 0.85);
        } else {
            System.out.printf("The %s product's price is less than $50. No discount is applied for this product\n", getName());
        }
    }
}
