package com.example.news_service.service;

import com.example.news_service.model.News;
import com.example.news_service.model.Preferences;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import java.util.stream.Collectors;

@Service
public class NewsService {

    private List<News> newsList = new ArrayList<>();

    // Constructor to add some sample data


    public List<News> getAllNews() {
        return newsList;
    }

    public Optional<News> getNewsById(Long id) {
        return newsList.stream()
                .filter(news -> news.getId().equals(id))
                .findFirst();
    }

    public News saveNews(News news) {
        newsList.add(news);
        return news;
    }

    public List<News> getNewsByCategory(String category) {
        return newsList.stream()
                .filter(news -> news.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public List<News> getNewsByPreferences(Preferences preferences) {
        return newsList.stream()
                .filter(news -> (preferences.getCategory() == null || news.getCategory().equalsIgnoreCase(preferences.getCategory())) &&
                        (preferences.getAuthor() == null || news.getAuthor().equalsIgnoreCase(preferences.getAuthor())) &&
                        (preferences.getKeyword() == null || news.getContent().contains(preferences.getKeyword())))
                .collect(Collectors.toList());
    }
}