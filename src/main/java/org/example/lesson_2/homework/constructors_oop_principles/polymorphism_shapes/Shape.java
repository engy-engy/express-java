package org.example.lesson_2.homework.constructors_oop_principles.polymorphism_shapes;

/**
 * Создайте иерархию классов для фигур:
 * Абстрактный класс Shape:
 * Абстрактный метод double getArea().
 * Абстрактный метод double getPerimeter().
 * Класс Rectangle (прямоугольник), наследуется от Shape:
 * Поля: width (ширина), height (высота).
 * Реализует методы для расчёта площади и периметра.
 * Класс Circle, наследуется от Shape:
 * Поле: radius (радиус).
 * Реализует методы для расчёта площади и периметра
 */
public abstract class Shape {

    public abstract double getArea();
    public abstract double getPerimeter();
}
