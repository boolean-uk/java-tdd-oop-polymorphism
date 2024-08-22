package com.booleanuk.vehicle;

public class Main {
    public static void main(String[] args) {
        Mover mover = new Mover();
        Car car=new Car();
        Plane plane=new Plane();
        Skateboard skateboard=new Skateboard();
        mover.move(car,200);
        mover.move(plane, 500);
        mover.move(skateboard,600);
    }
}
