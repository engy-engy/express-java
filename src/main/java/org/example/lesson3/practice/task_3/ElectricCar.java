package org.example.lesson3.practice.task_3;

public class ElectricCar extends Transport implements Refuelable {

    private double batteryLevel;

    public ElectricCar(String brand, String model, int year) {
        super(brand, model, year);
        this.batteryLevel = 0;
    }

    @Override
    public String refuel(double count) {
        batteryLevel += count;
        return String.format("Заряжено на %.2f %%" , count);
    }

    @Override
    public boolean needsRefueling() {
        return batteryLevel < 25;
    }

    @Override
    public String getFuelState() {
        return String.format("Уровень заряда %.2f %%", batteryLevel);
    }

}
