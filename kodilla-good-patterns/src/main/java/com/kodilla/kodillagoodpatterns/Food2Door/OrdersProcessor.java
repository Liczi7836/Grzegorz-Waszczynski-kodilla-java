package com.kodilla.kodillagoodpatterns.Food2Door;

import java.util.Set;

public class OrdersProcessor {
    private Set<ShopService> shopServices;
    private OrdersRepository ordersRepository;


    public OrdersProcessor(final Set<ShopService> shopServices, final OrdersRepository ordersRepository) {
        this.shopServices = shopServices;
        this.ordersRepository = ordersRepository;
    }

    public OrdersProcessorDto process(final OrderRequest orderRequest) {
        int shopId = orderRequest.getCompanyID();

        ShopService shopService = shopServices.stream()
                .filter(shop -> shop.getId() == shopId).findAny()
                .orElseThrow();

        boolean isSent = shopService.send(orderRequest.getCompanyName(), orderRequest.getProductType(), orderRequest.getQuantity());

        if (isSent) {
            ordersRepository.createOrder(orderRequest.getCompanyName(), orderRequest.getProductType(), orderRequest.getQuantity());
            return new OrdersProcessorDto(orderRequest.getCompanyName(), true);
        } else {
            return new OrdersProcessorDto(orderRequest.getCompanyName(), false);
        }
    }
}
