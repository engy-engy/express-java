package org.example.lesson_3.practice.task_2;

/**
 * Задача: Создание класса Person
 * Описание:
 * Создать класс Person, который будет содержать следующие характеристики и функциональности:
 * Поля:
 * firstName (имя, строка)
 * lastName (фамилия, строка)
 * age (возраст, целое число)
 * Конструкторы:
 * Конструктор, который принимает имя, фамилию и возраст.
 * Методы (геттеры и сеттеры):
 * getFirstName(), setFirstName(String firstName)
 * getLastName(), setLastName(String lastName)
 * getAge(), setAge(int age)
 * Переопределение методов:
 * equals(Object other)
 * hashCode()
 * toString()
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Person[firstName='%s', lastName='%s', age=%d]".formatted(firstName, lastName, age);
    }

    @Override
    public int hashCode() {
        return 31 * firstName.hashCode() * lastName.hashCode() * age;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        return firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) &&
                age == person.age;
    }

}
