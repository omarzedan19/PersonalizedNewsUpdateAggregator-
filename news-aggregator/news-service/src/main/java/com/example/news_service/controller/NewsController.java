package com.example.news_service.controller;

import com.example.news_service.model.News;
import com.example.news_service.model.Preferences;
import com.example.news_service.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping
    public ResponseEntity<List<News>> getAllNews() {
        return ResponseEntity.ok(newsService.getAllNews());
    }

    @GetMapping("/{id}")
    public ResponseEntity<News> getNewsById(@PathVariable Long id) {
        return newsService.getNewsById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<News> saveNews(@RequestBody News news) {
        return ResponseEntity.ok(newsService.saveNews(news));
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<News>> getNewsByCategory(@PathVariable String category) {
        return ResponseEntity.ok(newsService.getNewsByCategory(category));
    }

    @PostMapping("/preferences")
    public ResponseEntity<List<News>> getNewsByPreferences(@RequestBody Preferences preferences) {
        return ResponseEntity.ok(newsService.getNewsByPreferences(preferences));
    }
}