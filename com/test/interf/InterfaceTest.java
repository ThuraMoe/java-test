package com.test.interf;

public class InterfaceTest {
    
    public static void main(String[] args) {
        
        Car toyota = new Car();
        Drone drone = new Drone();
        Aeroplane plane = new Aeroplane();

        drive(plane);
        drive(toyota);

        play(drone);

        fly(plane);
        fly(drone);

        Flyable bird = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Bird is Flying!");
            }
        };
        fly(bird);

    }

    static void drive(Vehical v) {
        v.drive();
    }

    static void play(Toy t) {
        t.play();
    }

    static void fly(Flyable f) {
        f.fly();
    }
}
