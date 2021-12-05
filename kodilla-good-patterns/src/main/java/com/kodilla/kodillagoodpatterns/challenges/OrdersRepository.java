package com.kodilla.kodillagoodpatterns.challenges;

public interface OrdersRepository {
    boolean createOrder(User user, String itemName, double price);
}
