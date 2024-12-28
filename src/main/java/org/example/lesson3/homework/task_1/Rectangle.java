package org.example.lesson3.homework.task_1;

/**
 * Rectangle, который представляет прямоугольник.
 */
public class Rectangle {

    private int width;

    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return 2 * width + height;
    }

}
