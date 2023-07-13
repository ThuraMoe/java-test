package com.trm.registration;

// import com.trm.teaching.Course course;
import com.trm.teaching.*;

public class Student {

    String name;
    Course course;

    private static int count;

    public Student(String name) {
        count++;
        this.name = name;
    }

    public void takeCourse(Course c) {
        course = c;
    }

    public void sayYourCourse() {
        System.out.println("My name is " + name);
        System.out.println("I am taking " + course.name);
    }

    public static void showStudentCount() {
        System.out.println("Number of Student : " + count);
    }
}
