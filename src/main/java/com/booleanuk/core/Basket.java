package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    ArrayList<Product> products = new ArrayList<>();

    public void add(Product item){
        this.products.add(item);
    }

    public int getTotal() {
        int total = 0;
        for(Product item : products){
            total += item.getPrice();
        }
        return total;
    }

    public boolean isInBasket(String name) {
        for (Product item : products) {
            if (item.getName().equals(name)) {
                return true;
            }
        }

        return false;
    }
}
