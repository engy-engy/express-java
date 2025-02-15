package org.example.lesson_5.homework.task_6;

import java.util.ArrayList;

public class NotificationService {

    private ArrayList<NotificationChannel> channels = new ArrayList<>();

    public void notifyAllChannels(String message) {
        for (NotificationChannel channel : channels) {
            channel.notifyFromChannel(message);
        }
    }

    public void subscribe(NotificationChannel channel) {
        channels.add(channel);
    }

    public void unsubscribe(NotificationChannel channel) {
        channels.remove(channel);
    }

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.subscribe(new SmsNotificationChannel("89997776655"));
        notificationService.subscribe(new EmailNotificationChannel("qqq@q.ru"));
        notificationService.notifyAllChannels("Today service is DOWN");
    }

}