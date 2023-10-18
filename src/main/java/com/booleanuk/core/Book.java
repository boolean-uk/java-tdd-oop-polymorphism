package com.booleanuk.core;

public class Book implements Product{
    String name;
    int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
