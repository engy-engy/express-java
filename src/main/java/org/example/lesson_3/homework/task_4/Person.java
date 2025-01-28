package org.example.lesson_3.homework.task_4;

import org.example.lesson_3.homework.task_4.enums.City;
import org.example.lesson_3.homework.task_4.enums.Gender;

import java.util.Objects;

/**
 * Person, который будет представлять
 */
public class Person {

    private String name;
    private int age;
    private Gender gender;
    private City city;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Gender gender, City city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
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

    @Override
    public String toString() {
        return String.format("Person: name=%s | Age=%d | Gender=%s | City=%s", name, age, gender, city);
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public static void main(String[] args) {
        Person ivan1 = new Person("Ivan", 25, Gender.MAN, City.NEW_YORK);
        Person ivan2 = new Person("Ivan", 25);
        ivan2.setGender(Gender.UNKNOWN);
        ivan2.setCity(City.UNKNOWN);
        System.out.println(ivan1);
        System.out.println(ivan2);
        System.out.println(ivan1.equals(ivan2));
    }
}
