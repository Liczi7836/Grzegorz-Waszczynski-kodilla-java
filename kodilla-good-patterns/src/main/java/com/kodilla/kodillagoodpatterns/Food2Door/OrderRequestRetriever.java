package com.kodilla.kodillagoodpatterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {
    private List<Company> companyList = new ArrayList<>();

    public OrderRequest retrieve(){
        Company ExtraFoodShop = new Company("ExtraFoodShop", "Meat", 1000, 1);
        Company HealthyShop = new Company("HealthyShop", "Healthy Food", 500, 2);
        Company GlutenFreeShop = new Company("GlutenFreeShop", "Gluten Free Food", 400, 3);
        companyList.add(ExtraFoodShop);
        companyList.add(HealthyShop);
        companyList.add(GlutenFreeShop);
        String productType = "Meat";
        int quantity = 1000;
        int ID = 1;
    return new OrderRequest(ExtraFoodShop,productType,quantity,ID);
    }

    public List<Company> getCompanyList() {
        return companyList;
    }
}
