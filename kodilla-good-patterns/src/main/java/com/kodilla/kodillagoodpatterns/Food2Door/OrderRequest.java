package com.kodilla.kodillagoodpatterns.Food2Door;

public class OrderRequest {
    private String companyName;
    private String productType;
    private int quantity;
    private int companyID;

    public OrderRequest(String companyName, String productType, int quantity, int companyID) {
        this.companyName = companyName;
        this.productType = productType;
        this.quantity = quantity;
        this.companyID = companyID;
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

    public int getCompanyID(){
        return companyID;
    }
}
