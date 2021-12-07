package com.kodilla.kodillagoodpatterns.Food2Door;

public interface OrdersRepository {
    boolean createOrder(Company company, String productType, int quantity);
}
