package org.example.lesson_5.practice.lesson_task_1;

public class SmsNotificationChannel extends NotificationChannel {

    private String phoneNumber;

    public SmsNotificationChannel(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notifyFromChannel(String message) {
        System.out.println("Sending sms: " + message + " to " + this.phoneNumber);
    }
}
