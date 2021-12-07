package com.kodilla.kodillagoodpatterns.Food2Door;

public class OrdersProcessor {
    private SendingService sendingService;
    private OrdersRepository ordersRepository;

    public OrdersProcessor(final SendingService sendingService, final OrdersRepository ordersRepository) {
        this.sendingService = sendingService;
        this.ordersRepository = ordersRepository;
    }

    public OrdersProcessorDto process(final OrderRequest orderRequest) {
        boolean isSent = sendingService.send(orderRequest.getCompany(), orderRequest.getProductType(), orderRequest.getQuantity());
        if (isSent) {
            ordersRepository.createOrder(orderRequest.getCompany(), orderRequest.getProductType(), orderRequest.getQuantity());
            return new OrdersProcessorDto(orderRequest.getCompany(), true);
        } else {
            return new OrdersProcessorDto(orderRequest.getCompany(), false);
        }
    }
}
