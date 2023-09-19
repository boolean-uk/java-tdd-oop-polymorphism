package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Item> item = new ArrayList<>();

    public void add(Item item) {
        this.item.add(item);
    }

    public int getTotal() {
        int total = 0;

        for (Item item : this.item) {
            total += item.getPrice();
        }

        return total;
    }

    public boolean isInBasket(String name) {
        for (Item item : this.item) {
            if (item.getName().equals(name)) {
                return true;
            }
        }

        return false;
    }
}
