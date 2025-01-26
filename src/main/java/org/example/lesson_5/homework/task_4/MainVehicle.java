package org.example.lesson_5.homework.task_4;

import org.example.lesson_5.homework.task_4.strategies.BikeStrategy;
import org.example.lesson_5.homework.task_4.strategies.BoatStrategy;
import org.example.lesson_5.homework.task_4.strategies.CarStrategy;
import org.example.lesson_5.homework.task_4.strategies.VehicleStrategy;

public class MainVehicle {

//    public class VehicleFactory {
//        public Object createVehicle(String type) {
//            if (type.equals("car")) {
//                return new Car();
//            } else if (type.equals("bike")) {
//                return new Bike();
//            } else {
//                throw new IllegalArgumentException("Unknown vehicle type: " + type);
//            }
//        }
//    }
    public static void main(String[] args) {
        VehicleStrategy carStrategy = new CarStrategy();
        VehicleStrategy bikeStrategy = new BikeStrategy();
        VehicleStrategy boatStrategy = new BoatStrategy();

        carStrategy.buildVehicle();
        bikeStrategy.buildVehicle();
        boatStrategy.buildVehicle();
    }
}
