package org.example.lesson2.homework.constructors_oop_principles.polymorphism_shapes;

/**
 * Метод Circle getArea(): (π * r^2)
 * Метод Circle getPerimeter(): (C = 2 · π · r)
 */
public class Circle extends Shape{

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * Math.PI * radius);
    }
}
