package com.booleanuk.example;

public class Plane implements Vehicle{
    public void move(int meters) {
        System.out.println("The plane flew for " + meters + " meters.");
    }
}
