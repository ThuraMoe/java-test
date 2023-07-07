package com.trm.teaching;

public class Lesson {

    private String name;
    private Course course;

    public Lesson(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void showInfo() {
        System.out.println("This is " + name + " lesson from " + course.name);
    }
    
}
