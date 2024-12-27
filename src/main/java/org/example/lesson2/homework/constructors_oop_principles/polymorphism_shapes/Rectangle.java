package org.example.lesson2.homework.constructors_oop_principles.polymorphism_shapes;

/**
 * Метод Rectangle getArea(): (S пр = a ⋅ b)
 * Метод Rectangle getPerimeter(): (P = 2 ∙ (a + b))
 */
public class Rectangle extends Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
