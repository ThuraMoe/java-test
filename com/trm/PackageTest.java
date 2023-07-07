package com.trm;

import com.trm.registration.*;
import com.trm.teaching.*;

public class PackageTest {
    
    public static void main(String[] args) {
        
        Course c = new Course("Java SE");

        Student student = new Student("TRM");
        student.takeCourse(c);

        student.sayYourCourse();
    }
}
