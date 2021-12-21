package com.kodilla.kodillagoodpatterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class OrderRequestRetriever {
    private final Map<Integer, Company> companies = new HashMap<>();

    public OrderRequestRetriever() {
        companies.put(1, new Company("ExtraFoodShop", "Meat", 1000, 1));
        companies.put(2, new Company("HealthyShop", "Healthy Food", 500, 2));
        companies.put(3, new Company("GlutenFreeShop", "Gluten Free Food", 400, 3));
    }

    public OrderRequest retrieve(int companyID) {
        Company company = companies.get(companyID);

        String companyName = company.getCompanyName();
        String productType = company.getProductType();
        int quantity = company.getQuantity();

        return new OrderRequest(companyName, productType, quantity, companyID);
    }


}
