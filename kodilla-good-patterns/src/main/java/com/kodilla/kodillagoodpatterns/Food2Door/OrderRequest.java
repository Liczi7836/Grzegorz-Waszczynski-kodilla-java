package com.kodilla.kodillagoodpatterns.Food2Door;

public class OrderRequest {
    private Company company;
    private String productType;
    private int quantity;

    public OrderRequest(Company company, String productType, int quantity) {
        this.company = company;
        this.productType = productType;
        this.quantity = quantity;
    }

    public Company getCompany() {
        return company;
    }

    public String getProductType() {
        return productType;
    }

    public int getQuantity() {
        return quantity;
    }
}
