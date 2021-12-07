package com.kodilla.kodillagoodpatterns.Food2Door;

public class Company {

    private String companyName;
    private String productType;
    private int quantity;

    public Company(String companyName, String productType, int quantity) {
        this.companyName = companyName;
        this.productType = productType;
        this.quantity = quantity;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getProductType() {
        return productType;
    }

    public int getQuantity() {
        return quantity;
    }
}
