package com.example.notification_service.controller;

import com.example.notification_service.model.News;
import com.example.notification_service.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/email")
    public ResponseEntity<Void> sendEmail(@RequestParam String email, @RequestParam String subject, @RequestParam String content) {
        notificationService.sendEmail(email, subject, content);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/telegram")
    public ResponseEntity<Void> sendTelegramMessage(@RequestParam String telegramHandle, @RequestParam String message) {
        notificationService.sendTelegramMessage(telegramHandle, message);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/news-topic")
    public ResponseEntity<Void> handleNewsEvent(@RequestBody News news) {
        notificationService.sendNotifications(news);
        return ResponseEntity.ok().build();
    }

    // Other endpoints for different communication channels
}