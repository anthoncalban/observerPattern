package com.example.news;

public class BaseSubscriber implements Subscriber {
    private String name;

    public BaseSubscriber(String name) 
    {
        this.name = name;
    }

    @Override
    public void update(NewsEvent event) 
    {
        System.out.println(name + " received news: " + event.getTitle() + " - " + event.getContent());
    }
}
