package org.example.lesson_5.homework.task_4;

import org.example.lesson_5.homework.task_4.strategies.BikeStrategy;
import org.example.lesson_5.homework.task_4.strategies.BoatStrategy;
import org.example.lesson_5.homework.task_4.strategies.CarStrategy;
import org.example.lesson_5.homework.task_4.strategies.VehicleStrategy;

public class VehicleStrategyHandler {
    public static VehicleStrategy getStrategy(VehicleType vehicleType) {
        return switch (vehicleType) {
            case CAR -> new CarStrategy();
            case BIKE -> new BikeStrategy();
            case BOAT -> new BoatStrategy();
        };
    }
}
