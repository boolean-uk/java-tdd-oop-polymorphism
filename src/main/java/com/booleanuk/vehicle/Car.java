package com.booleanuk.vehicle;

public class Car implements Vehicle{
    public void move(int metres){
        System.out.println("Car moved " + metres+ " metres");
    }
}
