package com.booleanuk.core.vehicles;

public class Main {
    public static void main(String[] args){
        Car car = new Car();
        Plane plane = new Plane();
        SkateBoard skateBoard = new SkateBoard();
        Mover mover = new Mover();
        mover.move(car, 150);
        mover.move(plane, 250);
        mover.move(skateBoard, 50);
    }
}
