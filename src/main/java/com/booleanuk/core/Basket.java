package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Product> product = new ArrayList<>();
//    List<Drink> drinks = new ArrayList<>();
//    List<Book> books = new ArrayList<>();

    public void add(Product product) {
        this.product.add(product);
    }

//    public void add(Drink drink) {
//        this.drinks.add(drink);
//    }
//
//    public void add(Book book) {
//        this.books.add(book);
//    }

    public int getTotal() {
        int total = 0;

        for (Product product : this.product) {
            total += product.getPrice();
        }

//        for (Drink drink : this.drinks) {
//            total += drink.getPrice();
//        }
//
//        for (Book book : this.books) {
//            total += book.getPrice();
//        }

        return total;
    }

    public boolean isInBasket(String name) {
        for (Product product : this.product) {
            if (product.getName().equals(name)) {
                return true;
            }
        }

//        for (Drink drink : this.drinks) {
//            if (drink.getName().equals(name)) {
//                return true;
//            }
//        }
//
//        for (Book book : this.books) {
//            if (book.getName().equals(name)) {
//                return true;
//            }
//        }

        return false;
    }
}
