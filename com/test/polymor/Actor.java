package com.test.polymor;

public abstract class Actor implements GameItem {
    
    private String name;

    public Actor (String name) {
        // super();
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    public abstract void fight();


}
