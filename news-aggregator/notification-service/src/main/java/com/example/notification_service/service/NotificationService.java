package com.example.notification_service.service;

import com.example.notification_service.model.News;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendEmail(String email, String subject, String content) {
        // Implement email sending logic here
        // For example, use JavaMailSender to send an email.
        System.out.println("Sending email to " + email);
        System.out.println("Subject: " + subject);
        System.out.println("Content: " + content);
    }

    public void sendTelegramMessage(String telegramHandle, String message) {
        // Implement Telegram message sending logic here
        // For example, use a Telegram bot API to send a message.
        System.out.println("Sending Telegram message to " + telegramHandle);
        System.out.println("Message: " + message);
    }

    public void sendNotifications(News news) {
        // Implement logic to send notifications based on news event
        if (news.getEmail() != null && !news.getEmail().isEmpty()) {
            sendEmail(news.getEmail(), "News Update: " + news.getTitle(), news.getContent());
        }
        if (news.getTelegramHandle() != null && !news.getTelegramHandle().isEmpty()) {
            sendTelegramMessage(news.getTelegramHandle(), news.getContent());
        }
    }

    // Other methods for different communication channels can be added here
}