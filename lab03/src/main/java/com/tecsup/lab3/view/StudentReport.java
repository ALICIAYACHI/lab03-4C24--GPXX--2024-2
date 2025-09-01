package com.tecsup.lab3.view;

import java.util.List;

import com.tecsup.lab3.model.Student;

public class StudentReport {
    public static void print(List<Student> students) {
        System.out.println("=== Student Report ===");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
