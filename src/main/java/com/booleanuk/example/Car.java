package com.booleanuk.example;

public class Car implements Vehicle {
    public void move(int metres) {
        System.out.println("The car has accelerated for " + metres + " metres.");
    }
}