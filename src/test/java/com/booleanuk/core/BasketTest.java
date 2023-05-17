package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void shouldCalculateTotal() {
        Basket basket = new Basket();
        basket.add(new Game("Morrowind", 12));
        basket.add(new Book("Darkly Dreaming Dexter", 6));
        basket.add(new Drink("Cappucino", 2));

        Assertions.assertEquals(20, basket.getTotal());
    }

    @Test
    public void testAddProduct(){
        Basket basket = new Basket();
        boolean temp = false;
        // test for success
        basket.add(new Game("Morrowind", 12));
        for (int i = 0; i < basket.product.size(); i++) {
            if(basket.product.get(i).getName().equals("Morrowind")){
                temp = true;
            }
        }
        Assertions.assertTrue(temp);
    }

    @Test
    public void shouldFindExistingProduct() {
        Basket basket = new Basket();
        basket.add(new Game("Morrowind", 12));
        basket.add(new Book("Darkly Dreaming Dexter", 6));
        basket.add(new Drink("Cappucino", 2));

        Assertions.assertTrue(basket.isInBasket("Morrowind"));
    }

    @Test
    public void shouldNotFindNonExistingProduct() {
        Basket basket = new Basket();
        basket.add(new Game("Morrowind", 12));
        basket.add(new Book("Darkly Dreaming Dexter", 6));
        basket.add(new Drink("Cappucino", 2));

        Assertions.assertFalse(basket.isInBasket("Skyrim"));
    }
}
