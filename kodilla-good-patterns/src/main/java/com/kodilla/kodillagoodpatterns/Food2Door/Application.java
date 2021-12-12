package com.kodilla.kodillagoodpatterns.Food2Door;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve(1);

        OrdersProcessor ordersProcessor = new OrdersProcessor(new FoodOrderService(), new OrderRepository());
        ordersProcessor.process(orderRequest);


    }
}
