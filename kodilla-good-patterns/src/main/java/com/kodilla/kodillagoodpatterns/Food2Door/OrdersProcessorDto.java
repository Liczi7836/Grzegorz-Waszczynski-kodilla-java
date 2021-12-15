package com.kodilla.kodillagoodpatterns.Food2Door;

public class OrdersProcessorDto {
    public String company;
    public boolean isSent;

    public OrdersProcessorDto(String company, boolean isSent) {
        this.company = company;
        this.isSent = isSent;
    }

    public String getCompany() {
        return company;
    }

    public boolean isSent() {
        return isSent;
    }
}
