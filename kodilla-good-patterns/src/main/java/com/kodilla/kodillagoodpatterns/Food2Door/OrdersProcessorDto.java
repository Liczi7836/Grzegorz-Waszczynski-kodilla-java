package com.kodilla.kodillagoodpatterns.Food2Door;

public class OrdersProcessorDto {
    public Company company;
    public boolean isSent;

    public OrdersProcessorDto(Company company, boolean isSent) {
        this.company = company;
        this.isSent = isSent;
    }

    public Company getCompany() {
        return company;
    }

    public boolean isSent() {
        return isSent;
    }
}
