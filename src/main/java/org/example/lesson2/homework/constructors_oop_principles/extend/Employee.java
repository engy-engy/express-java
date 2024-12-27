package org.example.lesson2.homework.constructors_oop_principles.extend;

/**
 * Наследование - Класс "Сотрудник" и "Менеджер"
 * Создайте два класса:
 * Employee (сотрудник) с полями:
 * name (имя),
 * salary (зарплата).
 * Конструктор для инициализации полей.
 * Метод printInfo(), выводящий информацию о сотруднике.
 * Manager, который наследуется от Employee:
 * Дополнительное поле bonus (премия).
 * Переопределите метод printInfo() так, чтобы он выводил и бонус.
 */
public class Employee {

    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println(name + ": зарплата " + salary);
    }
}