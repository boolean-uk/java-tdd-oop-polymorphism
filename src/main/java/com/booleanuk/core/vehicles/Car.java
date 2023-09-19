package com.booleanuk.core.vehicles;

public class Car implements Vehicle{
    public void move(int metres){
        System.out.println("You drove " + metres + "m");
    }
}
