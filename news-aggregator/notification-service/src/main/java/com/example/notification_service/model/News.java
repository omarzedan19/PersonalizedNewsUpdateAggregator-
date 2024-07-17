package com.example.notification_service.model;

public class News {
    private Long id;
    private String title;
    private String category;
    private String author;
    private String content;
    private String email; // For email notifications
    private String telegramHandle; // For Telegram notifications

    // Constructor
    public News(Long id, String title, String category, String author, String content, String email, String telegramHandle) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.author = author;
        this.content = content;
        this.email = email;
        this.telegramHandle = telegramHandle;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelegramHandle() {
        return telegramHandle;
    }

    public void setTelegramHandle(String telegramHandle) {
        this.telegramHandle = telegramHandle;
    }
}