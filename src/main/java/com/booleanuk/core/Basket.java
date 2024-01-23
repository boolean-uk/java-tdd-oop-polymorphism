package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<BasketItem> items = new ArrayList<>();

    public void add(BasketItem item) {
        this.items.add(item);
    }


    public int getTotal() {
        int total = 0;

        for (BasketItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public boolean isInBasket(String name) {
        for (BasketItem item : items) {
            if (item.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}