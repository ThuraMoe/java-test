package com.test.polymor;

public class Hero extends Actor {

    public Hero(String name) {
        super(name);
    }
    
    public void fight() {
        System.out.println("I am fighting!");
    }

    public void doWork() {
        System.out.printf("%s is working %n", getName());
        fight();
    }

    public void greet() {
        System.out.println("I'm " + getName());
    }

}
