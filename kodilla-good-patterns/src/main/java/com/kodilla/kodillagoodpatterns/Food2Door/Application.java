package com.kodilla.kodillagoodpatterns.Food2Door;

import com.kodilla.kodillagoodpatterns.Food2Door.shops.ExtraFoodShop;
import com.kodilla.kodillagoodpatterns.Food2Door.shops.GlutenFreeShop;
import com.kodilla.kodillagoodpatterns.Food2Door.shops.HealthyShop;

import java.util.Set;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest ExtraFoodShopOrderRequest = orderRequestRetriever.retrieve(1);
        OrderRequest HealthyShopOrderRequest = orderRequestRetriever.retrieve(2);


        Set<ShopService> shopServices = Set.of(new ExtraFoodShop(), new HealthyShop(), new GlutenFreeShop());


        OrdersProcessor ordersProcessor = new OrdersProcessor(shopServices, new OrderRepository());
        ordersProcessor.process(ExtraFoodShopOrderRequest);
        ordersProcessor.process(HealthyShopOrderRequest);
        if (ordersProcessor.process(ExtraFoodShopOrderRequest).isSent){
            System.out.println("Package with food was sent");
        }
        if (ordersProcessor.process(HealthyShopOrderRequest).isSent){
            System.out.println("Package with food was sent");
        }

    }
}
