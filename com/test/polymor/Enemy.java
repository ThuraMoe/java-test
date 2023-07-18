package com.test.polymor;

public class Enemy extends Actor{ 
    
    public Enemy(String name) {
        super(name);
    }

    public void doWork() {
        System.out.println("Hey! Do you want to challenge me?");
    }

    public void fight() {
        System.out.println("Ha ha ha! I will never die.");
    }
}
