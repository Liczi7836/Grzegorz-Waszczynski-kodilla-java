package com.kodilla.kodillagoodpatterns.Food2Door;

public class Company {

    private String companyName;
    private String productType;
    private int quantity;
    private int ID;

    public Company(String companyName, String productType, int quantity, int ID) {
        this.companyName = companyName;
        this.productType = productType;
        this.quantity = quantity;
        this.ID = ID;
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

    public int getID(){
        return ID;
    }
}
