package com.kodilla.kodillagoodpatterns.challenges;

public class ProductOrderService implements SellingService{

    public boolean sell(final User user, final String itemName, final double price){
        System.out.println("Selling " + itemName + " to " + user.getName() + " " + user.getLastName() + " for " + price);

        return true;
    }
}
