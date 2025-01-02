package org.example.lesson3.homework.task_9;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> listBooks;

    public Library() {
        this.listBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.listBooks.add(book);
    }

    public Book searchBook(String title) {
        for (Book item : listBooks) {
            if (item.getTitle().equals(title)) return item;
        }
        return null;
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book item : listBooks) {
            if (item.isAvailable()) {
                availableBooks.add(item);
            }
        }
        return availableBooks;
    }
}
