package org.example.lesson_3.homework.task_10.products;

/**
 * Electronics class, подкласс описывает метод для применения скидки на товары электроники
 */
public class Electronics extends Product {

    public Electronics(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void applyDiscount() {
        if (this.getPrice() > 100) {
            this.setPrice(this.getPrice() * 0.90); // Скидка 10%
        } else {
            System.out.printf("The %s product's price is less than $100. No discount is applied for this product.\n", getName());
        }
    }
}
