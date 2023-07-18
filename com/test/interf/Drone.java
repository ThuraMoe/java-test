package com.test.interf;

public class Drone extends Toy implements Flyable {
    
    public void play() {
        System.out.println("Drone is flying");
    }

    public void fly() {
        System.out.println("Drone can fly with limitation");
    }
}
