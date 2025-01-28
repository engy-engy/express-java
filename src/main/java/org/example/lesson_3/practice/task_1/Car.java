package org.example.lesson_3.practice.task_1;

/**
 * Задача: Создание класса Car
 * Описание:
 * Создать класс Car, который будет содержать следующие характеристики и функциональности:
 * Поля:
 * brand (марка автомобиля, строка)
 * model (модель автомобиля, строка)
 * year (год выпуска, целое число)
 * isEngineOn (состояние двигателя, логическое значение)
 * Конструкторы:
 * Конструктор, который принимает марку, модель и год выпуска. Двигатель должен быть выключен при создании объекта.
 * Методы:
 * turnOnEngine() - метод для включения двигателя.
 * turnOffEngine() - метод для выключения двигателя.
 * getCarInfo() - метод, который возвращает информацию о машине (марка, модель, год выпуска и состояние двигателя).
 */
public class Car {

    private final String brand;
    private final String model;
    private final int year;
    private boolean isEngineOn;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isEngineOn = false;
    }

    public void setEngineState(boolean state) {
        this.isEngineOn = state;
    }

    public String getCarInfo() {
        return "Brand: %s%nModel: %s%nYear: %d%nEngine: %b".formatted(brand, model, year, isEngineOn);
    }

    @Override
    public String toString() {
        return "Brand: %s%nModel: %s%nYear: %d%nEngine: %b".formatted(brand, model, year, isEngineOn);
    }
}
