package com.booleanuk.core;


class Book implements Product {
     private String name;
     private int price;
     public Book(String name, int price){
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
