package org.example.lesson_3.homework.task_9;

import java.util.List;

public class MainLibrary {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("Гарри Поттер", "Дж.К. Роулинг", 1997, true));
        library.addBook(new Book("Война и мир", "Л.Н. Толстой", 1869, true));
        library.addBook(new Book("1984", "Джордж Оруэлл", 1949, false));


        // Поиск книги по названию
        String searchTitle = "1984";
        Book foundBook = library.searchBook(searchTitle);
        if (foundBook != null) {
            System.out.println("Найдена книга: " + foundBook.getBookInfo());
        } else {
            System.out.println("Книга с названием \"" + searchTitle + "\" не найдена.");
        }

        // Отображение всех доступных книг
        System.out.println("\nСписок доступных книг:");
        List<Book> availableBooks = library.getAvailableBooks();
        for (Book book : availableBooks) {
            System.out.println(book.getBookInfo());
        }

        // Взять книгу из библиотеки
        if (foundBook != null && foundBook.isAvailable()) {
            System.out.println("\nБерем книгу: " + foundBook.getTitle());
            foundBook.borrowBook();
        } else if (foundBook != null) {
            System.out.println("\nКнига \"" + foundBook.getTitle() + "\" уже занята.");
        }

        // Отображение всех доступных книг после взятия
        System.out.println("\nСписок доступных книг после изменений:");
        availableBooks = library.getAvailableBooks();
        for (Book book : availableBooks) {
            System.out.println(book.getBookInfo());
        }

        // Вернуть книгу в библиотеку
        if (foundBook != null) {
            System.out.println("\nВозвращаем книгу: " + foundBook.getTitle());
            foundBook.returnBook();
        }

        // Отображение всех доступных книг после возврата
        System.out.println("\nСписок доступных книг после возврата:");
        availableBooks = library.getAvailableBooks();
        for (Book book : availableBooks) {
            System.out.println(book.getBookInfo());
        }
    }
}