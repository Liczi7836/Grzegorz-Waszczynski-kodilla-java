package com.kodilla.kodillagoodpatterns.Food2Door;

public class FoodOrderService implements SendingService {

    public boolean send(final Company company, String productType, int quantity){
        System.out.println("Preparing order from " + company.getCompanyName()
                + " with " + productType + " in an amount of " + quantity);

        return true;
    }
}
