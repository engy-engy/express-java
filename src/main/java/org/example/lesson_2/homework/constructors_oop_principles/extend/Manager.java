package org.example.lesson_2.homework.constructors_oop_principles.extend;

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
public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void printInfo() {
        System.out.println(name + ": зарплата " + salary + ", бонус " + bonus);
    }

}
