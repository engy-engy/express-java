package org.example.lesson_3.practice.task_3;

public class Car extends Transport implements Refuelable{

    private double fuelLevel;

    public Car(String brand, String model, int year) {
        super(brand, model, year);
        this.fuelLevel = 0;
    }

    @Override
    public String refuel(double count) {
        fuelLevel += count;
        return String.format("Заправлено на %.2f%n", fuelLevel);
    }

    @Override
    public boolean needsRefueling() {
        return fuelLevel < 25;
    }

    @Override
    public String getFuelState() {
        return String.format("Уровень топлива %.2f %%", fuelLevel);
    }

}
