package com.kodilla.kodillagoodpatterns.challenges;

public class OrdersProcessorDto {
    public User user;
    public boolean isSold;

    public OrdersProcessorDto(final User user, final boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public boolean isSold() {
        return isSold;
    }
}
