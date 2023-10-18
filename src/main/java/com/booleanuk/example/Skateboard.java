package com.booleanuk.example;

public class Skateboard implements Vehicle {
    public void move(int metres) {
        System.out.println("The skateboard rolled for " + metres + " metres.");
    }
}