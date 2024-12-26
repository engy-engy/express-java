package org.example.lesson2.homework.constructors_oop_principles;

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
