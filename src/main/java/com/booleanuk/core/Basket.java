package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Product> items = new ArrayList<>();

    public void add(Product product) {
        this.items.add(product);
    }


    public int getTotal() {
        int total = 0;

        for (Product p : this.items) {
            total += p.getPrice();
        }

        return total;
    }

    public boolean isInBasket(String name) {
        for (Product p : this.items) {
            if (p.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
