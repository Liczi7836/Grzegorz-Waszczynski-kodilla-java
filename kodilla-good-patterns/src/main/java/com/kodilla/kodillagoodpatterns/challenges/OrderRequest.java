package com.kodilla.kodillagoodpatterns.challenges;

public class OrderRequest {
    private User user;
    private String itemName;
    private double price;

    public OrderRequest(final User user, final String itemName, final double price) {
        this.user = user;
        this.itemName = itemName;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
}
