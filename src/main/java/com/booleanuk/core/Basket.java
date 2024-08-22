package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private ArrayList<Product> products;

    public Basket() {
        this.products = new ArrayList<>();
    }

    public void add(Product p) {
        this.products.add(p);
    }

    public int getTotal() {
        int total = 0;

        for (Product p : this.products) total += p.getPrice();

        return total;
    }

    public boolean isInBasket(String name) {
        for (Product p : this.products) if (p.getName().equals(name)) return true;
        return false;
    }
}
