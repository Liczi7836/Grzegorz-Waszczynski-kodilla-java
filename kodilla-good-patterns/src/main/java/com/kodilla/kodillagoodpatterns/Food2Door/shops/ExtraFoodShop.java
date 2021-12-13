package com.kodilla.kodillagoodpatterns.Food2Door.shops;

import com.kodilla.kodillagoodpatterns.Food2Door.ShopService;

public class ExtraFoodShop implements ShopService {

    @Override public boolean send(String company, String productType, int quantity) {
        /**
         * todo...
         */
        System.out.println("blah blah ExtraFoodShop");
        return false;
    }

    @Override public int getId() {
        return 1;
    }
}
