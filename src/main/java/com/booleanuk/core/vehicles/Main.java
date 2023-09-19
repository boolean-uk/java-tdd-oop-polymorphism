package com.booleanuk.core.vehicles;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Mover mover = new Mover();
        mover.move(car,150);
    }
}
