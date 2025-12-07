package com.example.news;

public class NewsEvent {
    private String title;
    private String content;

    public NewsEvent(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() { return title; }
    public String getContent() { return content; }
}
