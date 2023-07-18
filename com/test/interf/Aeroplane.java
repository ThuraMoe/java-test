package com.test.interf;

public class Aeroplane extends Vehical implements Flyable {

    public void drive() {
        System.out.println("Aeroplane is flying");
    }

    public void fly() {
        drive();
    }
}
