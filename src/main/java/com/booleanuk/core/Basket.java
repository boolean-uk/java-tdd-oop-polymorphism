package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Products> products = new ArrayList<>();


    public void add(Products product) {
        this.products.add(product);
    }

    public int getTotal() {
        int total = 0;

        for (Products product : this.products) {
            total += product.getPrice();
        }

        return total;
    }

    public boolean isInBasket(String name) {
        for (Products product : this.products) {
            if (product.getName().equals(name)) {
                return true;
            }
        }

        return false;
    }
}
