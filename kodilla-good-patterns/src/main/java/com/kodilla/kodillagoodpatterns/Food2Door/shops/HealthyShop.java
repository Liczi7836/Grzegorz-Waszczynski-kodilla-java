package com.kodilla.kodillagoodpatterns.Food2Door.shops;

import com.kodilla.kodillagoodpatterns.Food2Door.ShopService;

public class HealthyShop implements ShopService {
    @Override public boolean send(String company, String productType, int quantity) {

        System.out.println("Preparing package with healthy food from HealthyShop");
        return false;
    }

    @Override public int getId() {
        return 2;
    }
}
