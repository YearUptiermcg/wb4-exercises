package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Car c = new Car("Jeep","CJ-7");
        c.accelerate(5);
        c.accelerate(10);
        c.brake(3);
        System.out.println(c.getSpeed());

    }
}