package com.kodilla.kodillagoodpatterns.Food2Door;

public interface OrdersRepository {
    boolean createOrder(String company, String productType, int quantity);
}
