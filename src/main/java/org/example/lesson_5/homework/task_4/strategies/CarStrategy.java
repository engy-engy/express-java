package org.example.lesson_5.homework.task_4.strategies;

public class CarStrategy implements VehicleStrategy {
    @Override
    public void buildVehicle() {
        System.out.println("init - CarStrategy");
    }
}
