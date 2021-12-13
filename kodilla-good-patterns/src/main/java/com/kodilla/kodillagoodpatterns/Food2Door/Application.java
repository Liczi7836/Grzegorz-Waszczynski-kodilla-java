package com.kodilla.kodillagoodpatterns.Food2Door;

import java.util.Set;

import com.kodilla.kodillagoodpatterns.Food2Door.shops.ExtraFoodShop;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve(1);

        Set<ShopService> shopServices = Set.of(new ExtraFoodShop());

        OrdersProcessor ordersProcessor = new OrdersProcessor(shopServices, new OrderRepository());
        ordersProcessor.process(orderRequest);

    }
}
