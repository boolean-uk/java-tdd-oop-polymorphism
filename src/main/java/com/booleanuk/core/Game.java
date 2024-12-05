package com.booleanuk.core;


class Game implements Product {
    private String name;
    private int price;
    public Game (String name, int price){
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
