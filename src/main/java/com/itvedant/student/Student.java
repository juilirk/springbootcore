package com.itvedant.student;

import org.springframework.stereotype.Component;

@Component
public class Student {
    Student(){
        System.out.println("\nStudent Object Created\n");
    }

    public void print(){
        System.out.println("\nprint method of the Student class\n");
    }
}
