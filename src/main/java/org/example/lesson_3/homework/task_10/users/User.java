package org.example.lesson_3.homework.task_10.users;

/**
 * User class, описывающий поля и методы для работы с пользователем
 */
public class User {

    private final String id;
    private String name;
    private String email;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayUserInfo() {
        System.out.printf("id = %s, name = %s, email = %s\n", id, name, email);
    }
}
