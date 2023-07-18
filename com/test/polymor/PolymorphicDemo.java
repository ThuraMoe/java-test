package com.test.polymor;

public class PolymorphicDemo {

    public static void main(String[] args) {

        Hero hero = new Hero("lighting");
        work(hero);
        System.out.println();

        GameItem item = hero;
        work(item);
        System.out.println();

        Actor actor = hero;
        work(actor);
        System.out.println();

        Enemy enemy = new Enemy("Bolder Mov");
        work(enemy);
        System.out.println();

        GameItem enemyItem = enemy;
        work(enemyItem);

    }

    static void work(GameItem item) {
        System.out.println("GameItem is working");
        item.doWork();
    }

    static void work(Actor actor) {
        System.out.println("Actor is working");
        actor.doWork();
        actor.fight();
    }

    static void work(Hero hero) {
        System.out.println("Hero is working");
        hero.greet();
        hero.doWork();
        hero.fight();
    }
}
