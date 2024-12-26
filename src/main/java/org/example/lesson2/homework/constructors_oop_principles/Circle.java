package org.example.lesson2.homework.constructors_oop_principles;

/**
 * Создайте класс Circle, который будет описывать круг с помощью следующих свойств и методов:
 * Поле radius (радиус круга).
 * Конструктор, который принимает радиус круга.
 * Метод getArea(), возвращающий площадь круга (π * r^2).
 * Метод getCircumference(), возвращающий длину окружности (2 * π * r).
 * Пример использования:
 * Circle circle = new Circle(5);
 * System.out.println("Площадь: " + circle.getArea());
 * System.out.println("Длина окружности: " + circle.getCircumference());
 */
public class Circle {

    private final int radius;

    public Circle(int radius) {
        if (radius == 0) {
            throw new IllegalArgumentException("Radius не может быть 0");
        }
        this.radius = radius;
    }

    public double getArea() {
        return Math.round(Math.PI * Math.pow(radius, 2) * 100.0) / 100.0;
    }

    public double getCircumference() {
        return Math.round((2 * Math.PI * radius) * 100.0) / 100.0;
    }
}
