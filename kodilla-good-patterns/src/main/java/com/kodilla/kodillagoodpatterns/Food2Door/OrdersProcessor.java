package com.kodilla.kodillagoodpatterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class OrdersProcessor {
    private SendingService sendingService;
    private OrdersRepository ordersRepository;


    public OrdersProcessor(final SendingService sendingService, final OrdersRepository ordersRepository) {
        this.sendingService = sendingService;
        this.ordersRepository = ordersRepository;
    }
    OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
    private List<Company> companyList = orderRequestRetriever.getCompanyList();


    public OrdersProcessorDto process(final OrderRequest orderRequest) {
        boolean isSent = false;
        for (Company company : companyList){
            if (company.equals(orderRequest.getCompany())){
                isSent = sendingService.send(orderRequest.getCompany(), orderRequest.getProductType(), orderRequest.getQuantity());
            }
        }
        if (isSent) {
            ordersRepository.createOrder(orderRequest.getCompany(), orderRequest.getProductType(), orderRequest.getQuantity());
            return new OrdersProcessorDto(orderRequest.getCompany(), true);
        } else {
            return new OrdersProcessorDto(orderRequest.getCompany(), false);
        }
    }
}
