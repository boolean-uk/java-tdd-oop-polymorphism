package com.booleanuk.core;

class Drink implements Product{
    private String name;
    private int price;
    public Drink (String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
