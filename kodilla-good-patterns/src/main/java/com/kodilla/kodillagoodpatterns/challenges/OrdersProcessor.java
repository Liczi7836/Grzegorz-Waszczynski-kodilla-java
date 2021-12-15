package com.kodilla.kodillagoodpatterns.challenges;

public class OrdersProcessor {

    private InformationService informationService;
    private SellingService sellingService;
    private OrdersRepository ordersRepository;

    public OrdersProcessor(final InformationService informationService, final SellingService sellingService, final OrdersRepository ordersRepository) {
        this.informationService = informationService;
        this.sellingService = sellingService;
        this.ordersRepository = ordersRepository;
    }

    public OrdersProcessorDto process(final OrderRequest orderRequest){
        boolean isSold = sellingService.sell(orderRequest.getUser(),orderRequest.getItemName(),orderRequest.getPrice());
        if (isSold){
            informationService.inform(orderRequest.getUser());
            ordersRepository.createOrder(orderRequest.getUser(),orderRequest.getItemName(),orderRequest.getPrice());
            return new OrdersProcessorDto(orderRequest.getUser(), true);
        } else {
            return new OrdersProcessorDto(orderRequest.getUser(), false);
        }

    }
}
