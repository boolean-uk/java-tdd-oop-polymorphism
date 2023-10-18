package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Iitem> items = new ArrayList<>();


    public void add(Iitem item) {
        items.add(item);
    }

    public int getTotal() {
        int total = 0;

        for (Iitem item : this.items) {
            total += item.getPrice();
        }


        return total;
    }

    public boolean isInBasket(String name) {
        for (Iitem item : this.items) {
            if (item.getName().equals(name)) {
                return true;
            }
        }

        return false;
    }
}
