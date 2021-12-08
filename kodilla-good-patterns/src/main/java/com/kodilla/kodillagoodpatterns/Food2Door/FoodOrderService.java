package com.kodilla.kodillagoodpatterns.Food2Door;

public class FoodOrderService implements SendingService {

    public boolean send(final Company company, String productType, int quantity){
        boolean ifIsReady = false;
        if (company.getID() == 1) {
            System.out.println("Preparing extra food package from " + company.getCompanyName()
                    + " in an amount of " + quantity);

            ifIsReady = true;
        } else if (company.getID() == 2){
            System.out.println("Preparing healthy food package from " + company.getCompanyName()
                    + " in an amount of " + quantity);

            ifIsReady = true;
        } else if (company.getID() == 3){
            System.out.println("Preparing gluten free food package from " + company.getCompanyName()
                    + " in an amount of " + quantity);

            ifIsReady = true;
        }
        return ifIsReady;

    }
}
