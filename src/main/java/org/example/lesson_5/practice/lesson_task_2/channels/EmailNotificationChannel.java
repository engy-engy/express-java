package org.example.lesson_5.practice.lesson_task_2.channels;

public class EmailNotificationChannel extends NotificationChannel {

    private String email;

    public EmailNotificationChannel(String email) {
        this.email = email;
    }

    @Override
    public void notifyFromChannel(String message) {
        System.out.println("Sending email: " + message + " to " + this.email);
    }
}
