package org.example.lesson2.homework.constructors_oop_principles;

/**
 * Создайте класс Book, который описывает книгу:
 * Поля: title (название), author (автор), price (цена).
 * Конструктор, который принимает все три параметра.
 * Метод printInfo(), который выводит информацию о книге в формате:
 * php
 *
 * Название: <title>, Автор: <author>, Цена: <price>
 */
public class Book {

    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printInfo() {
        System.out.printf("Название: %s, Автор: %s, Цена: %s", title, author, price);
    }
}
