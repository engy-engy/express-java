    Задача: Разработка транспортной системы
    Требования:
    Создать абстрактный класс Vehicle с основными атрибутами для всех транспортных средств: марка (brand), модель (model), год выпуска (year). Добавить абстрактный метод для получения информации о состоянии топлива или заряда.
    Определить интерфейс Refuelable с методами для заправки транспортного средства и проверки, нуждается ли оно в заправке.
    Реализовать два класса, Car и ElectricCar, которые наследуются от Vehicle и реализуют интерфейс Refuelable. Класс Car должен управлять уровнем топлива, а класс ElectricCar — уровнем заряда батареи.
    Особенности выполнения задачи:
    Для каждого класса должны быть реализованы соответствующие методы для управления и отображения уровня топлива или заряда.
    Классы должны корректно обрабатывать наследование от Vehicle и реализацию интерфейса Refuelable.
    Цель задачи — проверить ваше умение в использовании абстрактных классов и интерфейсов, а также ваш подход к реализации полиморфизма и инкапсуляции в объектно-ориентированном программировании.
    
    Для данной задачи создадим абстрактный класс Vehicle, интерфейс Refuelable и конкретные классы Car и ElectricCar, которые будут наследоваться от Vehicle и реализовывать интерфейс Refuelable. В этом примере будут использованы различные аспекты ООП, такие как абстрактные классы, интерфейсы, переопределение методов и использование конструктора родительского класса.
    Абстрактный класс Vehicle
    Этот класс будет содержать базовую информацию о транспортном средстве и определять абстрактный метод для получения статуса топлива или заряда.
    
    public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    
        public Vehicle(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }
    
        // Абстрактный метод, который должен быть реализован в подклассах
        public abstract String getFuelStatus();
    }
    
    Интерфейс Refuelable
    Интерфейс будет включать методы для заправки и проверки необходимости заправки.
    
    public interface Refuelable {
    void refuel();
    boolean needsRefueling();
    }
    
    Класс Car
    Класс Car расширяет Vehicle и реализует Refuelable. В этом классе мы переопределим методы интерфейса и абстрактного класса.
    
    public class Car extends Vehicle implements Refuelable {
    private double fuelLevel;
    
        public Car(String brand, String model, int year) {
            super(brand, model, year);  // Использование конструктора родительского класса
            this.fuelLevel = 50.0;  // Предположим, что новая машина приходит с половиной бака
        }
    
        @Override
        public void refuel() {
            fuelLevel = 100.0;
            System.out.println("Машина заправлена полностью.");
        }
    
        @Override
        public boolean needsRefueling() {
            return fuelLevel < 25.0;
        }
    
        @Override
        public String getFuelStatus() {
            return "Уровень топлива: " + fuelLevel + "%";
        }
    }
    
    Класс ElectricCar
    Класс ElectricCar также наследуется от Vehicle и реализует Refuelable, но с учетом специфики электромобилей.
    
    public class ElectricCar extends Vehicle implements Refuelable {
    private double batteryLevel;
    
        public ElectricCar(String brand, String model, int year) {
            super(brand, model, year);
            this.batteryLevel = 50.0;  // Аналогично, предполагаем, что новая машина приходит с половиной заряда батареи
        }
    
        @Override
        public void refuel() {
            batteryLevel = 100.0;
            System.out.println("Электромобиль полностью заряжен.");
        }
    
        @Override
        public boolean needsRefueling() {
            return batteryLevel < 25.0;
        }
    
        @Override
        public String getFuelStatus() {
            return "Уровень заряда батареи: " + batteryLevel + "%";
        }
    }
