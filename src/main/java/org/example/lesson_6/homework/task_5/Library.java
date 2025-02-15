package org.example.lesson_6.homework.task_5;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private final Map<String, Book> books;
    private Book activeBook;

    public Library() {
        this.books = new HashMap<>();
        this.activeBook = null;
    }

    public void addBook(Book book) {
        this.books.put(book.getName(), book);
    }

    public void switchActiveBook(String name) {
        if (this.books.get(name) == null) {
            System.out.println("Error: Book \"" + name + "\" not found in the library.");
            return;
        }
        if (this.books.get(name).equals(this.activeBook)) {
            System.out.println("Error: Book \"" + name + "\" is already active.");
            return;
        }
        if (activeBook != null) {
            this.books.get(name).setCurrentPage(activeBook.getCurrentPage());
        }
        activeBook = this.books.get(name);
        System.out.println("Switched to book: " + activeBook.getName());
    }

    public void showActiveBookInfo() {
        if (this.activeBook == null) {
            System.out.println("No active book.");
        } else {
            System.out.println("Current active book: " + activeBook.getName() + ", page: " + activeBook.getCurrentPage());
        }
    }

    public void readActiveBook() {
        if (this.activeBook == null) {
            System.out.println("No active book to read.");
            return;
        }
        System.out.println("Reading book: " + activeBook.getName() + ", page: " + activeBook.getCurrentPage());
        activeBook.readNextPage();
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("book1"));
        library.addBook(new Book("book2"));

        library.showActiveBookInfo();
        library.readActiveBook();

        library.switchActiveBook("book2");
        library.showActiveBookInfo();

        library.readActiveBook();
        library.readActiveBook();
        library.readActiveBook();
        library.showActiveBookInfo();

        library.switchActiveBook("book3");
        library.switchActiveBook("book2");

    }
}
