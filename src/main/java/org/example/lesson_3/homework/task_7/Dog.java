package org.example.lesson_3.homework.task_7;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Собака лает");
    }

    public void fetch() {
        System.out.println("Собака приносит палку");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Dex",5);
        dog.makeSound();
        dog.fetch();
    }

}
