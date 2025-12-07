package com.example.news;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) 
    {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) 
    {
        subscribers.remove(subscriber);
    }

    public void publishNews(String title, String content) 
    {
        NewsEvent event = new NewsEvent(title, content);
        notifySubscribers(event);
    }

    private void notifySubscribers(NewsEvent event) 
    {
        for (Subscriber subscriber : subscribers) 
            {
            subscriber.update(event);
        }
    }
}
