package org.example.lesson_3.homework.task_9;

public class Book {

    private String title;
    private String author;
    private int yearPublished;
    private boolean isAvailable;

    public Book(String title, String author, int yearPublished, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isAvailable = isAvailable;
    }

    public void borrowBook() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getAuthor() {
        return author;
    }
    public int getYearPublished() {
        return yearPublished;
    }

    public String getBookInfo() {
        return String.format("Название: %s, Автор: %s, Год издания: %d, Доступна: %b", title, author, yearPublished, isAvailable);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return title.equals(book.title) &&
                author.equals(book.author) &&
                yearPublished == book.yearPublished;
    }

    public String getTitle() {
        return title;
    }

}
