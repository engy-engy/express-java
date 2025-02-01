package org.example.lesson_6.homework.task_5;

public class Book {
    private final String name;
    private int currentPage;

    public Book(String name) {
        this.name = name;
        this.currentPage = 1;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int page) {
        if (page < 1) {
            System.out.println("Error: Page number should be more than 0.");
            return;
        }
        this.currentPage = page;
    }

    public void readNextPage() {
        this.currentPage++;
    }
}
