package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Game> games = new ArrayList<>();
    List<Drink> drinks = new ArrayList<>();
    List<Book> books = new ArrayList<>();
    List<Item> allItems = new ArrayList<>();

    public void add(Item item) {
        if (item instanceof Game) {
            this.games.add((Game) item);
        }
        else if (item instanceof Drink) {
            this.drinks.add((Drink) item);
        }
        else {
            this.books.add((Book) item);
        }
        this.allItems.add(item);
    }


    public int getTotal() {
        int total = 0;

        for (Item item : this.allItems) {
            total += item.getPrice();
        }

        return total;
    }

    public boolean isInBasket(String name) {
        for (Item item : this.allItems) {
            if (item.getName().equals(name)) {
                return true;
            }
        }

        return false;
    }
}
