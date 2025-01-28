package org.example.lesson_3.practice.task_3;

/**
 *
 */
public abstract class Transport {

    private String brand;

    private String model;

    private int year;

    public Transport(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public abstract String getFuelState();
}
