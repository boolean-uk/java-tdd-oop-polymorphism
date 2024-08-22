package com.booleanuk.core.vehicles;

public class Plane implements Vehicle{
    public void move(int metres) {
        System.out.println("You flew " + metres + " m");
    }
}
