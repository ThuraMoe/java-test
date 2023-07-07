package com.trm.registration;

// import com.trm.teaching.Course course;
import com.trm.teaching.*;


public class Student {
    
    String name;
    Course course;

    public Student(String name) {
        this.name = name;
    }

    public void takeCourse(Course c) {
        course = c;
    }

    public void sayYourCourse() {
        System.out.println("My name is " + name);
        System.out.println("I am taking " + course.name);
    }
}
