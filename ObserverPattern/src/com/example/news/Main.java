package com.example.news;

public class Main {
    public static void main(String[] args) {
        
        NewsAgency agency = new NewsAgency();

        Subscriber alice = new BaseSubscriber("Alice");
        Subscriber bob = new BaseSubscriber("Bob");

        agency.subscribe(alice);
        agency.subscribe(bob);

        agency.publishNews("Breaking News", "A major event just happened!");
        agency.publishNews("Sports Update", "Local team wins championship!");

        agency.unsubscribe(bob);

        agency.publishNews("Weather Alert", "Heavy rain expected tomorrow.");
    }
}
