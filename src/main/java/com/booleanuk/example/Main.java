package com.booleanuk.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Plane plane = new Plane();
        Skateboard skate = new Skateboard();
        Mover mover = new Mover();

        mover.move(car, 400);
        mover.move(plane, 500);
        mover.move(skate, 40);
    }
}
