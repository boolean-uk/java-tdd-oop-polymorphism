package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Add> items = new ArrayList<>();

    public void add(Add item) {
        this.items.add(item);
    }

    public int getTotal() {
        int total = 0;
        for (Add item : this.items) {
            total += item.getPrice();
        }
        return total;
    }

    public boolean isInBasket(String name) {
        for (Add item : this.items) {
            if (item.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
