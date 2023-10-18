package com.booleanuk.example;

public class Car implements Vehicle {
    public void move(int meters) {
        System.out.println("Car accelerated for " + meters + " meters.");
    }
}
