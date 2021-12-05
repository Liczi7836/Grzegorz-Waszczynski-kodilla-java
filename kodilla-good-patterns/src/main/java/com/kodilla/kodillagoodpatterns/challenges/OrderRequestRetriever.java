package com.kodilla.kodillagoodpatterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        User user = new User("Jacek", "Nowak");

        String itemName = "Game1";
        double price = 99.99;
        return new OrderRequest(user,itemName,price);
    }
}
