package com.example.news;

import java.util.UUID;

public class BreakingNewsSubscriber implements Subscriber {
    private final String id;

    public BreakingNewsSubscriber() 
    {
        this.id = "Breaking-" + UUID.randomUUID().toString().substring(0, 8);
    }

    public void update(News news) 
    {
        System.out.println("[" + id + "] Received breaking news: " + news.getSummary());
        try { Thread.sleep(300); } catch (InterruptedException ignored) {}
    }

    public String getId() 
    {
        return id;
    }
}
