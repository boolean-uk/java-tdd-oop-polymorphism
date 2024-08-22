package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public int getTotal() {
        return products.stream().mapToInt(Product::getPrice).sum();
    }

    public boolean isInBasket(String name) {
        for (Product product : this.products)
            if (product.getName().equals(name))
                return true;

        return false;
    }
}
