package com.booleanuk.example;

public class Plane implements Vehicle {
    public void move(int metres) {
        System.out.println("The plane flew for " + metres + " metres.");
    }
}