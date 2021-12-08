package com.kodilla.kodillagoodpatterns.Food2Door;

public class OrderRequest {
    private Company company;
    private String productType;
    private int quantity;
    private int ID;

    public OrderRequest(Company company, String productType, int quantity, int ID) {
        this.company = company;
        this.productType = productType;
        this.quantity = quantity;
        this.ID = ID;
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

    public int getID(){
        return ID;
    }
}
