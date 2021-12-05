package com.kodilla.kodillagoodpatterns.challenges;

public class Application {

    public static void main(String[] args){
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrdersProcessor ordersProcessor = new OrdersProcessor(new MailService(),new ProductOrderService(),new OrderRepository());
        ordersProcessor.process(orderRequest);

    }
}
