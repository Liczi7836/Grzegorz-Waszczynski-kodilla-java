package com.kodilla.kodillagoodpatterns.Food2Door;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        Company ExtraFoodShop = new Company("ExtraFoodShop", "Meat", 1000);

        String productType = "Meat";
        int quantity = 1000;
    return new OrderRequest(ExtraFoodShop,productType,quantity);
    }
}
