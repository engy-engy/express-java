package org.example.lesson3.homework.task_4;

import java.util.Objects;

/**
 * Person, который будет представлять
 */
public class Person {

    private String name;
    private int age;
    private String gender;
    private String city;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String gender, String city) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // Проверка на равенство ссылок (если два объекта указывают на одну область памяти, они равны)
        if (this == obj) return true;

        // Проверка на null и совпадение классов объектов
        // Если переданный объект null или его класс отличается от текущего объекта, они не равны
        if (obj == null || getClass() != obj.getClass()) return false;

        // Приводим объект obj к типу Person
        Person person = (Person) obj;

        // Проверяем равенство двух объектов по значению полей name и age
        // Поле name сравнивается через Objects.equals для предотвращения ошибок с null
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() * age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
